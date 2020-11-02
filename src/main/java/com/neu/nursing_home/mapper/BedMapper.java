package com.neu.nursing_home.mapper;

import com.neu.nursing_home.entity.Bed;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value="bedMapper")
public interface BedMapper {
    public List<Bed> selectAllBed();
    public void insert(Bed newBed);
    public void delete(Integer id);
    public List<Bed> selectById(Integer id);
    public List<Bed> selectByStatus(String bed_status);
    public void update(Bed bed);
}
