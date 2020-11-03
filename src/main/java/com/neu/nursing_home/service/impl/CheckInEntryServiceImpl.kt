package com.neu.nursing_home.service.impl

import com.neu.nursing_home.entity.CheckInEntry
import com.neu.nursing_home.mapper.CheckInEntryMapper
import com.neu.nursing_home.service.CheckInEntryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class CheckInEntryServiceImpl() :
        CheckInEntryService {

    @Autowired
    private lateinit var checkInEntryMapper: CheckInEntryMapper

    override fun getAllCheckInEntries(): List<CheckInEntry> {
        return checkInEntryMapper.selectAllCheckInEntries()
    }

    override fun getPageCheckInEntries(pageNum: Int, pageSize: Int): List<CheckInEntry> {
        val list = checkInEntryMapper.selectAllCheckInEntries()
        val newList: MutableList<CheckInEntry> = ArrayList()
        for (index in (pageNum - 1) * pageSize until minOf(pageNum * pageSize, list.size)) {
            newList.add(list[index])
        }
        return newList
    }

    override fun addCheckInEntry(checkInEntry: CheckInEntry): Boolean {
        val lines = checkInEntryMapper.insertCheckInEntry(checkInEntry)
        return lines > 0
    }

    override fun removeCheckInEntryById(id: Int): Boolean {
        val lines = checkInEntryMapper.deleteCheckInEntryById(id)
        return lines > 0
    }

    override fun removeCheckInEntryByCustomerId(customerId: String): Boolean {
        val lines = checkInEntryMapper.deleteCheckInEntryByCustomerId(customerId)
        return lines > 0
    }
}