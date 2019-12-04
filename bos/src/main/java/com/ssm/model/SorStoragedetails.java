package com.ssm.model;

public class SorStoragedetails {
    private  Integer contractnumber;

    public Integer getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(Integer contractnumber) {
        this.contractnumber = contractnumber;
    }

    private  String states;

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    private Integer id;

    private String packageid;

    private Short weight;

    private String outboundid;

    @Override
    public String toString() {
        return "SorStoragedetails{" +
                "contractnumber=" + contractnumber +
                ", states='" + states + '\'' +
                ", id=" + id +
                ", packageid='" + packageid + '\'' +
                ", weight=" + weight +
                ", outboundid='" + outboundid + '\'' +
                ", state=" + state +
                '}';
    }

    private Short state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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