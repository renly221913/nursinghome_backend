package com.neu.nursing_home.controller;

import com.neu.nursing_home.entity.OutGoing;
import com.neu.nursing_home.entity.UserInfo;
import com.neu.nursing_home.service.OutGoingService;
import com.neu.nursing_home.util.JwtUtil;
import com.neu.nursing_home.vo.ResultVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/outgoing")
public class OutGoingController {
    @Resource
    public OutGoingService outGoingService;

    public String test() {
        return "success";
    }

    @RequestMapping("/findAll")
    public List<OutGoing> findAll() {
        return outGoingService.selectAllRecords();
    }

    @RequestMapping("/delete/{id}")
    public boolean delete(@PathVariable Integer id) {
        return outGoingService.deleteRecords(id);
    }

    @RequestMapping("/add")
    public Boolean add(@RequestBody OutGoing outGoing) {
        return outGoingService.insertRecords(outGoing);
    }
}


