package com.neu.nursing_home.entity;

public class OutGoing {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOutgoingDate() {
        return outgoingDate;
    }

    public void setOutgoingDate(String outgoingDate) {
        this.outgoingDate = outgoingDate;
    }

    public String getOutgoingReason() {
        return outgoingReason;
    }

    public void setOutgoingReason(String outgoingReason) {
        this.outgoingReason = outgoingReason;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    private String customerName;
    private String outgoingDate;
    private String outgoingReason;
    private String returnDate;
    private String remarks;
}
