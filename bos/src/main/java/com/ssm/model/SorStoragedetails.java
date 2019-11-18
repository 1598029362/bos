package com.ssm.model;

public class SorStoragedetails {
    private Short id;

    private String packageid;

    private Short weight;

    private String outboundid;

    private Short state;

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

    public String getOutboundid() {
        return outboundid;
    }

    public void setOutboundid(String outboundid) {
        this.outboundid = outboundid == null ? null : outboundid.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }
}