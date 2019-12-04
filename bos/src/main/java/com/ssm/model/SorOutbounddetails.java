package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SorOutbounddetails {
    private Short id;

    private String packageid;

    private Short weight;

    private Short volume;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date scandate;

    private Short isscan;

    private Short isnextstorage;

    private Short isdoublestorage;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid == null ? null : packageid.trim();
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getVolume() {
        return volume;
    }

    public void setVolume(Short volume) {
        this.volume = volume;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getScandate() {
        return scandate;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setScandate(Date scandate) {
        this.scandate = scandate;
    }

    public Short getIsscan() {
        return isscan;
    }

    public void setIsscan(Short isscan) {
        this.isscan = isscan;
    }

    public Short getIsnextstorage() {
        return isnextstorage;
    }

    public void setIsnextstorage(Short isnextstorage) {
        this.isnextstorage = isnextstorage;
    }

    public Short getIsdoublestorage() {
        return isdoublestorage;
    }

    public void setIsdoublestorage(Short isdoublestorage) {
        this.isdoublestorage = isdoublestorage;
    }
}