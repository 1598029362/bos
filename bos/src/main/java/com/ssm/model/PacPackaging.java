package com.ssm.model;

import java.util.Date;

public class PacPackaging {
    private Short id;

    private String itemcode;

    private String itemname;

    private Short plannedprice;

    private String specifications;

    private Short type;

    private String measurementunit;

    private Short status;

    private Short operatorid;

    private Date operationtime;

    private Date invalidatejobint;

    private Short invalidatename;

    private Date invalidatetime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode == null ? null : itemcode.trim();
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public Short getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(Short plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getMeasurementunit() {
        return measurementunit;
    }

    public void setMeasurementunit(String measurementunit) {
        this.measurementunit = measurementunit == null ? null : measurementunit.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Short operatorid) {
        this.operatorid = operatorid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }

    public Date getInvalidatejobint() {
        return invalidatejobint;
    }

    public void setInvalidatejobint(Date invalidatejobint) {
        this.invalidatejobint = invalidatejobint;
    }

    public Short getInvalidatename() {
        return invalidatename;
    }

    public void setInvalidatename(Short invalidatename) {
        this.invalidatename = invalidatename;
    }

    public Date getInvalidatetime() {
        return invalidatetime;
    }

    public void setInvalidatetime(Date invalidatetime) {
        this.invalidatetime = invalidatetime;
    }
}