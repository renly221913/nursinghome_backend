package com.neu.nursing_home.service;

import com.neu.nursing_home.entity.Bed;

import java.util.List;

public interface BedService {
    public List<Bed> selectAllBed();
    public void addBed(Bed newBed);
    public void delete(Integer id);
    public List<Bed> selectById(Integer id);
}
