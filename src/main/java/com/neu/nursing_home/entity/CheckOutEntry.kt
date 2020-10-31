package com.neu.nursing_home.entity

data class CheckOutEntry(
        var id: Int = -1,
        var customerId: String?,
        var checkOutDate: String?,
        var remarks: String?
) {}