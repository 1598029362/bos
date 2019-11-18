package com.ssm.model;

import java.util.Date;

public class IaeTimeinput {
    private Short id;

    private String inputtype;

    private String port;

    private Short demand;

    private String vehicleint;

    private String waybillid;

    private Date expectarrivaldate;

    private Date expectdeparturedate;

    private Date actualarrivaldate;

    private Date actualdeparturedate;

    private String start;

    private Short carriers;

    private String remarks;

    private Short inputperson;

    private Date inputdate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public Short getDemand() {
        return demand;
    }

    public void setDemand(Short demand) {
        this.demand = demand;
    }

    public String getVehicleint() {
        return vehicleint;
    }

    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }

    public Date getExpectarrivaldate() {
        return expectarrivaldate;
    }

    public void setExpectarrivaldate(Date expectarrivaldate) {
        this.expectarrivaldate = expectarrivaldate;
    }

    public Date getExpectdeparturedate() {
        return expectdeparturedate;
    }

    public void setExpectdeparturedate(Date expectdeparturedate) {
        this.expectdeparturedate = expectdeparturedate;
    }

    public Date getActualarrivaldate() {
        return actualarrivaldate;
    }

    public void setActualarrivaldate(Date actualarrivaldate) {
        this.actualarrivaldate = actualarrivaldate;
    }

    public Date getActualdeparturedate() {
        return actualdeparturedate;
    }

    public void setActualdeparturedate(Date actualdeparturedate) {
        this.actualdeparturedate = actualdeparturedate;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public Short getCarriers() {
        return carriers;
    }

    public void setCarriers(Short carriers) {
        this.carriers = carriers;
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

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }
}