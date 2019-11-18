package com.ssm.model;

import java.util.Date;

public class DisDispatchhistory {
    private Short id;

    private Short dispatchsequence;

    private Short transferredunit;

    private Short operatorid;

    private Short operationunitid;

    private Date operationtime;

    private String remark;

    private Short status;

    private String reason;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getDispatchsequence() {
        return dispatchsequence;
    }

    public void setDispatchsequence(Short dispatchsequence) {
        this.dispatchsequence = dispatchsequence;
    }

    public Short getTransferredunit() {
        return transferredunit;
    }

    public void setTransferredunit(Short transferredunit) {
        this.transferredunit = transferredunit;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}