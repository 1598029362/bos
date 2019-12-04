package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BiglogLogisticscontroltable {
    private Short id;

    private String worksheetno;

    private Short ctype;

    private String corporation;

    private String waybillid;

    private String remarks;

    private Short inputperson;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date inputdate;

    private Short inputcompany;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Short getCtype() {
        return ctype;
    }

    public void setCtype(Short ctype) {
        this.ctype = ctype;
    }

    public String getCorporation() {
        return corporation;
    }

    public void setCorporation(String corporation) {
        this.corporation = corporation == null ? null : corporation.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getInputperson() {
        return inputperson;
    }

    public void setInputperson(Short inputperson) {
        this.inputperson = inputperson;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getInputdate() {
        return inputdate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public Short getInputcompany() {
        return inputcompany;
    }

    public void setInputcompany(Short inputcompany) {
        this.inputcompany = inputcompany;
    }
}