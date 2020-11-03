package com.neu.nursing_home.service.impl

import com.neu.nursing_home.entity.CheckInEntry
import com.neu.nursing_home.entity.CheckOutEntry
import com.neu.nursing_home.mapper.CheckOutEntryMapper
import com.neu.nursing_home.service.CheckOutEntryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CheckOutEntryServiceImpl : CheckOutEntryService {

    @Autowired
    private lateinit var checkOutEntryMapper: CheckOutEntryMapper

    override fun getAllCheckOutEntries(): List<CheckOutEntry> {
        return checkOutEntryMapper.selectAllCheckoutEntries()
    }

    override fun getPagedCheckOutEntries(pageNum: Int, pageSize: Int): List<CheckOutEntry> {
        val list = checkOutEntryMapper.selectAllCheckoutEntries()
        val newList: MutableList<CheckOutEntry> = ArrayList()
        for (index in (pageNum - 1) * pageSize until minOf(pageNum * pageSize, list.size)) {
            newList.add(list[index])
        }
        return newList
    }

    override fun addCheckOutEntry(checkOutEntry: CheckOutEntry): Boolean {
        val lines = checkOutEntryMapper.insertCheckOutEntry(checkOutEntry)
        return lines > 0
    }

    override fun removeCheckOutEntryById(id: Int): Boolean {
        val lines = checkOutEntryMapper.deleteCheckOutEntryById(id)
        return lines > 0
    }

    override fun removeCheckOutEntryByCustomerId(customerId: String): Boolean {
        val lines = checkOutEntryMapper.deleteCheckOutEntryByCustomerId(customerId)
        return lines > 0
    }
}