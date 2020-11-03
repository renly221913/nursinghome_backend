package com.neu.nursing_home.controller;

import com.neu.nursing_home.entity.Files;
import com.neu.nursing_home.util.FilesUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/file")
public class FileController {
    List<Files> listFile = new LinkedList<>();

    @Value("${web.upload-path}")
    private String path;

    /**
     * 上传文件
     *
     * @param file
     * @return
     */
    @RequestMapping("upload")
    public Object upload(MultipartFile file) {
        String oriName = file.getOriginalFilename();
        System.out.println(oriName);
        //文件改名
        //String name = UUID.randomUUID() + oriName.substring(oriName.lastIndexOf("."));
        try {
            FileOutputStream fs = new FileOutputStream(path + oriName);
            FileCopyUtils.copy(file.getInputStream(), fs);
            Files f = new Files();
            f.setName(oriName);
            listFile.add(f);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return 1;
    }

    /**
     * 文件列表
     */
    @CrossOrigin
    @PostMapping("listFile")
    @ResponseBody
    public Object listFile() {
        return listFile;
    }

    /**
     * 获取文件
     */
    @CrossOrigin
    @GetMapping("getFile")
    public void getFile(HttpServletResponse resp, @RequestParam String name) {
        try {
            FilesUtil.Download(resp, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
