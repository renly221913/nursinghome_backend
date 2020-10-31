package com.neu.nursing_home.controller;

import com.neu.nursing_home.entity.Bed;
import com.neu.nursing_home.service.BedService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bed")
public class BedController {
    @Resource
    BedService bedService;

    @RequestMapping("selectAllBed")//XXX风格，不用写?selectAll了，写/all
    //public Bed selectAllBed(@PathVariable String all)
    public List<Bed> selectAllBed(){
        return bedService.selectAllBed();
    }

    @RequestMapping("addBed")
    public String addBed(@RequestBody Bed newBed){
        bedService.addBed(newBed);
        return "succccc";
    }
/*
    @RequestMapping("addBed")
    public String addBed(@RequestBody Bed newBed){
        bedService.addBed(newBed);
        return "succccc";
    }*/

/*    @RequestMapping("addBed")
    public String addBed(String bed){
        return bed;
    }*/

    @RequestMapping("delBed/{id}")
    public String delBed(@PathVariable Integer id){
        bedService.delete(id);
        return "delsucc";
    }

    @RequestMapping("selectBedById/{id}")
    public List<Bed> selectBedById(@PathVariable Integer id){
        return bedService.selectById(id);
    }
}
