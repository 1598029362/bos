package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class IaeArrival {
    private String id;

    private String sendcompany;

    private String cargoaddress;

    private String issueperson;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date issuedate;

    private String workaddress;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date storagedate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date outbounddate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date timelimit;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date batch;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSendcompany() {
        return sendcompany;
    }

    public void setSendcompany(String sendcompany) {
        this.sendcompany = sendcompany == null ? null : sendcompany.trim();
    }

    public String getCargoaddress() {
        return cargoaddress;
    }

    public void setCargoaddress(String cargoaddress) {
        this.cargoaddress = cargoaddress == null ? null : cargoaddress.trim();
    }

    public String getIssueperson() {
        return issueperson;
    }

    public void setIssueperson(String issueperson) {
        this.issueperson = issueperson == null ? null : issueperson.trim();
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress == null ? null : workaddress.trim();
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public Date getOutbounddate() {
        return outbounddate;
    }

    public void setOutbounddate(Date outbounddate) {
        this.outbounddate = outbounddate;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public Date getBatch() {
        return batch;
    }

    public void setBatch(Date batch) {
        this.batch = batch;
    }
}