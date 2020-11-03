package com.neu.nursing_home.util;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Component
public class FilesUtil {

    public static String path = "";

    @Value("${web.upload-path}")
    public void setPath(String path) {
        FilesUtil.path = path;
    }

    public static void Download(HttpServletResponse response, String fileName) throws Exception {
        try {
            File file = new File(path, fileName);
            if (!file.exists()) {
                throw new Exception("文件不存在，请联系管理员！");
            }
            InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream = response.getOutputStream();
            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
            IOUtils.copy(inputStream, outputStream);
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
