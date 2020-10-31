package com.neu.nursing_home.controller

import com.neu.nursing_home.entity.CheckOutEntry
import com.neu.nursing_home.service.CheckOutEntryService
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

@RestController
@RequestMapping(value = ["checkout"], produces = ["application/json;charset=utf-8"])
class CheckOutEntryController {

    @Resource
    private lateinit var checkOutEntryService: CheckOutEntryService

    @GetMapping(value = ["all_checkout_entries"])
    fun getAllCheckOutEntries(): List<CheckOutEntry> {
        return checkOutEntryService.getAllCheckOutEntries()
    }

    @PutMapping(value = ["checkout_entry"])
    fun addCheckOutEntry(
            @RequestParam customerId: String?,
            @RequestParam checkOutDate: String?,
            @RequestParam remarks: String?
    ): Boolean {
        val checkOutEntry = CheckOutEntry(
                customerId = customerId,
                checkOutDate = checkOutDate,
                remarks = remarks
        )
        return checkOutEntryService.addCheckOutEntry(checkOutEntry)
    }

    @DeleteMapping(value = ["checkout_entry_by_id"])
    fun removeCheckOutEntryById(@RequestParam id: Int): Boolean {
        return checkOutEntryService.removeCheckOutEntryById(id)
    }

    @DeleteMapping(value = ["checkout_entry_by_customer_id"])
    fun removeCheckOutEntryByCustomerId(@RequestParam customerId: String): Boolean {
        return checkOutEntryService.removeCheckOutEntryByCustomerId(customerId)
    }
}