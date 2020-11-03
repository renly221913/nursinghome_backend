package com.neu.nursing_home.service.impl;

import com.neu.nursing_home.entity.OutGoing;
import com.neu.nursing_home.mapper.OutGoingMapper;
import com.neu.nursing_home.service.OutGoingService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutGoingServiceImpl implements OutGoingService {
    @Autowired
    OutGoingMapper outGoingMapper;

    @Override
    public List<OutGoing> selectAllRecords() {
        List<OutGoing> outList = outGoingMapper.selectAllRecords();
        return outList;
    }

    @Override
    public Boolean deleteRecords(int id) {
        int del = outGoingMapper.deleteRecords(id);
        if (del > 0)
            return true;
        else
            return false;
    }

    @Override
    public Boolean insertRecords(OutGoing outGoing) {
        int insert = outGoingMapper.insertRecords(outGoing);
        if (insert > 0)
            return true;
        else
            return false;
    }

}
