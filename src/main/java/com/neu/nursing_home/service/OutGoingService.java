package com.neu.nursing_home.service;

import com.neu.nursing_home.entity.OutGoing;

import java.util.List;

public interface OutGoingService {
    List<OutGoing> selectAllRecords();

    Boolean deleteRecords(int id);

    Boolean insertRecords(OutGoing outGoing);
}
