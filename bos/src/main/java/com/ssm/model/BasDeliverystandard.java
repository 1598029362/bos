package com.ssm.model;

import java.util.Date;

public class BasDeliverystandard {
    private Short id;

    private String name;

    private Short minweight;

    private Short maxweight;

    private Short operatorid;

    private Short operationunitid;

    private Date operationtime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getMinweight() {
        return minweight;
    }

    public void setMinweight(Short minweight) {
        this.minweight = minweight;
    }

    public Short getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(Short maxweight) {
        this.maxweight = maxweight;
    }

    public Short getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Short operatorid) {
        this.operatorid = operatorid;
    }

    public Short getOperationunitid() {
        return operationunitid;
    }

    public void setOperationunitid(Short operationunitid) {
        this.operationunitid = operationunitid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}