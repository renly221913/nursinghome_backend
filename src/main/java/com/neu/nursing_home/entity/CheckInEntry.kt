package com.neu.nursing_home.entity

data class CheckInEntry(
        var id: Int = -1,
        var customerId: String?,
        var customerName: String?,
        var customerAge: String?,
        var customerSex: String?,
        var bedId: String?,
        var checkInDate: String?,
        var remarks: String?
) {}