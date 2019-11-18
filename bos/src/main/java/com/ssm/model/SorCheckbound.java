package com.ssm.model;

import java.util.Date;

public class SorCheckbound {
    private Short id;

    private Short scanid;

    private Short cargosum;

    private Short checkperson;

    private Date checkdate;

    private String checkcompany;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getScanid() {
        return scanid;
    }

    public void setScanid(Short scanid) {
        this.scanid = scanid;
    }

    public Short getCargosum() {
        return cargosum;
    }

    public void setCargosum(Short cargosum) {
        this.cargosum = cargosum;
    }

    public Short getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(Short checkperson) {
        this.checkperson = checkperson;
    }

    public Date getCheckdate() {
        return checkdate;
    }

    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    public String getCheckcompany() {
        return checkcompany;
    }

    public void setCheckcompany(String checkcompany) {
        this.checkcompany = checkcompany == null ? null : checkcompany.trim();
    }
}