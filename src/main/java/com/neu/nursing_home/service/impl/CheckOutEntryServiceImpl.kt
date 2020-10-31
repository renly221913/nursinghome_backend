package com.neu.nursing_home.service.impl

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