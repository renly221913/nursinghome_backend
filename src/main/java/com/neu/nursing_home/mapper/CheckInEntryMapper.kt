package com.neu.nursing_home.mapper

import com.neu.nursing_home.entity.CheckInEntry
import com.neu.nursing_home.entity.CheckOutEntry
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Component


@Mapper
@Component(value = "CheckInEntryMapper")
interface CheckInEntryMapper {

    fun selectAllCheckInEntries(): List<CheckInEntry>

    fun insertCheckInEntry(checkInEntry: CheckInEntry): Int

    fun deleteCheckInEntryById(id: Int): Int

    fun deleteCheckInEntryByCustomerId(customerId: String): Int

}