package com.neu.nursing_home.mapper

import com.neu.nursing_home.entity.CheckInEntry
import com.neu.nursing_home.entity.CheckOutEntry
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Component

@Mapper
@Component(value = "CheckOutEntryMapper")
interface CheckOutEntryMapper {
    fun selectAllCheckoutEntries(): List<CheckOutEntry>

    fun insertCheckOutEntry(checkOutEntry: CheckOutEntry): Int

    fun deleteCheckOutEntryById(id: Int): Int

    fun deleteCheckOutEntryByCustomerId(customerId: String): Int
}