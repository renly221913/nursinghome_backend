package com.neu.nursing_home.service

import com.neu.nursing_home.entity.CheckInEntry

interface CheckInEntryService {
    fun getAllCheckInEntries(): List<CheckInEntry>

    fun getPageCheckInEntries(pageNum: Int, pageSize: Int): List<CheckInEntry>

    fun addCheckInEntry(checkInEntry: CheckInEntry): Boolean

    fun removeCheckInEntryById(id: Int): Boolean

    fun removeCheckInEntryByCustomerId(customerId: String): Boolean
}