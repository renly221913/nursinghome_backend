package com.neu.nursing_home.controller

import com.neu.nursing_home.entity.CheckInEntry
import com.neu.nursing_home.service.CheckInEntryService
import org.springframework.web.bind.annotation.*
import javax.annotation.Resource

@RestController
@RequestMapping(value = ["/checkin"], produces = ["application/json;charset=utf-8"])
class CheckInEntryController {

    @Resource
    private lateinit var checkInEntryService: CheckInEntryService

    @GetMapping(value = ["all_checkin_entries"])
    fun getAllCheckInEntries(): List<CheckInEntry> {
        return checkInEntryService.getAllCheckInEntries()
    }

    @PutMapping(value = ["checkin_entry"])
    fun addCheckInEntry(
            @RequestParam customerId: String?,
            @RequestParam customerName: String?,
            @RequestParam customerAge: String?,
            @RequestParam customerSex: String?,
            @RequestParam bedId: String?,
            @RequestParam checkInDate: String?,
            @RequestParam remarks: String?
    ): Boolean {
        val checkInEntry = CheckInEntry(
                customerId = customerId,
                customerName = customerName,
                customerAge = customerAge,
                customerSex = customerSex,
                bedId = bedId,
                checkInDate = checkInDate,
                remarks = remarks
        )
        return checkInEntryService.addCheckInEntry(checkInEntry)
    }

    @DeleteMapping(value = ["checkin_entry_by_id"])
    fun removeCheckInEntryById(@RequestParam id: Int): Boolean {
        return checkInEntryService.removeCheckInEntryById(id)
    }

    @DeleteMapping(value = ["checkin_entry_by_customer_id"])
    fun removeCheckInEntryByCustomerId(@RequestParam customerId: String): Boolean {
        return checkInEntryService.removeCheckInEntryByCustomerId(customerId)
    }
}