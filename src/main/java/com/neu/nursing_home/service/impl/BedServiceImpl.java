package com.neu.nursing_home.service.impl;

import com.mchange.v2.c3p0.test.ListTablesTest;
import com.neu.nursing_home.entity.Bed;
import com.neu.nursing_home.mapper.BedMapper;
import com.neu.nursing_home.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
