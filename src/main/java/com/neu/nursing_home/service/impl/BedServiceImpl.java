package com.neu.nursing_home.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.nursing_home.entity.Bed;
import com.neu.nursing_home.mapper.BedMapper;
import com.neu.nursing_home.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service("bedService")
public class BedServiceImpl implements BedService {
    @Autowired
    public BedMapper bedMapper;

    @Override
    public List<Bed> selectAllBed() {
        List<Bed> bedList=bedMapper.selectAllBed();
        return bedList;
    }

    @Override
    public List<Bed> selectByStatus(String bed_status) {
        List<Bed> bedList= bedMapper.selectByStatus(bed_status);
        return bedList;
    }

    @Override
    public void addBed(Bed newBed) {
        bedMapper.insert(newBed);
    }

    @Override
    public void delete(Integer id) {
        bedMapper.delete(id);
    }

    @Override
    public List<Bed> selectById(Integer id) {
        List<Bed> bedList= bedMapper.selectById(id);
        return bedList;
    }

/*    @Override
    public PageInfo<Bed> query(Integer currPage) {
        return null;
    }*/

    @Override
    public List<Bed> selectAll(Integer currPage) {
        PageHelper.startPage(currPage,5);
        List<Bed> list=bedMapper.selectAllBed();
        PageInfo<Bed> pi=new PageInfo<>(list);
        return pi.getList();
    }

    @Override
    public void update(Bed bed) {
        bedMapper.update(bed);
    }

/*    //参考博客https://blog.csdn.net/ilikejj0/article/details/81110009
    @Override
    public PageInfo<Bed> query(Integer currPage) {
        //传入查询的页码，以及显示的条数
        PageHelper.startPage(currPage,5);
        //使用pageInfo包装查询后的结果，封装了详细的查询数据，其中参数5是页码导航连续显示的页数
        PageInfo<Bed> pageInfo = new PageInfo<>(bedMapper.selectAllBed(),3);
        return pageInfo;
    }*/
}
