package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AccWorkorder {
    private Short id;

    @Override
    public String toString() {
        return "AccWorkorder{" +
                "id=" + id +
                ", businessnoticeno='" + businessnoticeno + '\'' +
                ", jobno='" + jobno + '\'' +
                ", jobtype=" + jobtype +
                ", pickupstatus=" + pickupstatus +
                ", shortmessageint=" + shortmessageint +
                ", workgenerationtime=" + workgenerationtime +
                ", aftersinglenum=" + aftersinglenum +
                ", smallmembernum=" + smallmembernum +
                ", pickupunit=" + pickupunit +
                ", pickuptime=" + pickuptime +
                ", sortingcode='" + sortingcode + '\'' +
                '}';
    }

    private String businessnoticeno;

    private String jobno;

    private Short jobtype;

    private Short pickupstatus;

    private Short shortmessageint;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date workgenerationtime;

    private Short aftersinglenum;

    private Short smallmembernum;

    private Short pickupunit;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pickuptime;

    private String sortingcode;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno == null ? null : jobno.trim();
    }

    public Short getJobtype() {
        return jobtype;
    }

    public void setJobtype(Short jobtype) {
        this.jobtype = jobtype;
    }

    public Short getPickupstatus() {
        return pickupstatus;
    }

    public void setPickupstatus(Short pickupstatus) {
        this.pickupstatus = pickupstatus;
    }

    public Short getShortmessageint() {
        return shortmessageint;
    }

    public void setShortmessageint(Short shortmessageint) {
        this.shortmessageint = shortmessageint;
    }

    public Date getWorkgenerationtime() {
        return workgenerationtime;
    }

    public void setWorkgenerationtime(Date workgenerationtime) {
        this.workgenerationtime = workgenerationtime;
    }

    public Short getAftersinglenum() {
        return aftersinglenum;
    }

    public void setAftersinglenum(Short aftersinglenum) {
        this.aftersinglenum = aftersinglenum;
    }

    public Short getSmallmembernum() {
        return smallmembernum;
    }

    public void setSmallmembernum(Short smallmembernum) {
        this.smallmembernum = smallmembernum;
    }

    public Short getPickupunit() {
        return pickupunit;
    }

    public void setPickupunit(Short pickupunit) {
        this.pickupunit = pickupunit;
    }

    public Date getPickuptime() {
        return pickuptime;
    }

    public void setPickuptime(Date pickuptime) {
        this.pickuptime = pickuptime;
    }

    public String getSortingcode() {
        return sortingcode;
    }

    public void setSortingcode(String sortingcode) {
        this.sortingcode = sortingcode == null ? null : sortingcode.trim();
    }
}