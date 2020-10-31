package com.neu.nursing_home.service

import com.neu.nursing_home.entity.CheckOutEntry

interface CheckOutEntryService {
    fun getAllCheckOutEntries(): List<CheckOutEntry>

    fun addCheckOutEntry(checkOutEntry: CheckOutEntry): Boolean

    fun removeCheckOutEntryById(id: Int): Boolean

    fun removeCheckOutEntryByCustomerId(customerId: String): Boolean

}