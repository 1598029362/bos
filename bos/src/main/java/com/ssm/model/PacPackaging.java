package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Insert;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PacPackaging {
    private Integer id;

    private String itemcode;

    private String itemname;

    private Integer plannedprice;

    private String specifications;

    private Integer type;

    private String measurementunit;

    private Integer status;

    private Integer operatorid;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date operationtime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date invalidatejobint;

    private Integer invalidatename;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date invalidatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(Integer plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMeasurementunit() {
        return measurementunit;
    }

    public void setMeasurementunit(String measurementunit) {
        this.measurementunit = measurementunit == null ? null : measurementunit.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getOperationtime() {
        return operationtime;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getInvalidatejobint() {
        return invalidatejobint;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setInvalidatejobint(Date invalidatejobint) {
        this.invalidatejobint = invalidatejobint;
    }

    public Integer getInvalidatename() {
        return invalidatename;
    }

    public void setInvalidatename(Integer invalidatename) {
        this.invalidatename = invalidatename;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getInvalidatetime() {
        return invalidatetime;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setInvalidatetime(Date invalidatetime) {
        this.invalidatetime = invalidatetime;
    }

    @Override
    public String toString() {
        return "PacPackaging{" +
                "id=" + id +
                ", itemcode='" + itemcode + '\'' +
                ", itemname='" + itemname + '\'' +
                ", plannedprice=" + plannedprice +
                ", specifications='" + specifications + '\'' +
                ", type=" + type +
                ", measurementunit='" + measurementunit + '\'' +
                ", status=" + status +
                ", operatorid=" + operatorid +
                ", operationtime=" + operationtime +
                ", invalidatejobint=" + invalidatejobint +
                ", invalidatename=" + invalidatename +
                ", invalidatetime=" + invalidatetime +
                '}';
    }
}