package com.neu.nursing_home.mapper;

import com.neu.nursing_home.entity.OutGoing;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "OutGoingMapper")
public interface OutGoingMapper {
    List<OutGoing> selectAllRecords();

    int deleteRecords(int id);

    int insertRecords(OutGoing outGoing);


}