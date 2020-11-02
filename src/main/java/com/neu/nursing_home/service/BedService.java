package com.neu.nursing_home.service;

import com.github.pagehelper.PageInfo;
import com.neu.nursing_home.entity.Bed;

import java.util.List;

public interface BedService {
    public List<Bed> selectAllBed();
    public List<Bed> selectByStatus(String bed_status);
    public void addBed(Bed newBed);
    public void delete(Integer id);
    public List<Bed> selectById(Integer id);
    //public PageInfo<Bed> query(Integer currPage);
    public List<Bed> selectAll(Integer currPage);
    public void update(Bed bed);
}
