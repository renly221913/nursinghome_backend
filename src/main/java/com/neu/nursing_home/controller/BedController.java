package com.neu.nursing_home.controller;

import com.github.pagehelper.PageInfo;
import com.neu.nursing_home.entity.Bed;
import com.neu.nursing_home.service.BedService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bed")
public class BedController {
    @Resource
    BedService bedService;

/*    @CrossOrigin(origins = "*",maxAge = 3600)*/
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


    @RequestMapping("selectBedByStatus/{bed_status}")
    public List<Bed> selectBedById(@PathVariable String bed_status){
        return bedService.selectByStatus(bed_status);
    }

    //@CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping("/testquery/{currPage}")
    public List<Bed> testquery(@PathVariable Integer currPage){
        return bedService.selectAll(currPage);
    }

    @RequestMapping("query/{currPage}")
    public PageInfo<Bed> query(@PathVariable Integer currPage){
        PageInfo<Bed> plist=new PageInfo<>(bedService.selectAll(currPage));
        return plist;
    }


    @RequestMapping("/update")
    public void update(@RequestBody Bed bed){
        bedService.update(bed);
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
