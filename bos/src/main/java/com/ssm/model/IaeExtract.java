package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class IaeExtract {


    private String id;

    private String vehicleint;

    private String transportway;

    private String waybillid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date estimatedate;

    private Short cargon;

    private String importanthints;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getVehicleint() {
        return vehicleint;
    }

    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    public String getTransportway() {
        return transportway;
    }

    public void setTransportway(String transportway) {
        this.transportway = transportway == null ? null : transportway.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid == null ? null : waybillid.trim();
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getEstimatedate() {
        return estimatedate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setEstimatedate(Date estimatedate) {
        this.estimatedate = estimatedate;
    }

    public Short getCargon() {
        return cargon;
    }

    public void setCargon(Short cargon) {
        this.cargon = cargon;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }
}