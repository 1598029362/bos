package com.ssm.model;

import java.util.Date;

public class SorPackage {
    private Integer id;

    private Integer packageperson;

    private String sealint;

    private String destination;

    private String reckondes;

    private Date timelimit;

    private Integer ticketsum;

    private Integer cargosum;

    private Integer weightsum;

    private Integer volumesum;

    private Integer state;

    private Integer ask;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageperson() {
        return packageperson;
    }

    public void setPackageperson(Integer packageperson) {
        this.packageperson = packageperson;
    }

    public String getSealint() {
        return sealint;
    }

    public void setSealint(String sealint) {
        this.sealint = sealint == null ? null : sealint.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getReckondes() {
        return reckondes;
    }

    public void setReckondes(String reckondes) {
        this.reckondes = reckondes == null ? null : reckondes.trim();
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public Integer getTicketsum() {
        return ticketsum;
    }

    public void setTicketsum(Integer ticketsum) {
        this.ticketsum = ticketsum;
    }

    public Integer getCargosum() {
        return cargosum;
    }

    public void setCargosum(Integer cargosum) {
        this.cargosum = cargosum;
    }

    public Integer getWeightsum() {
        return weightsum;
    }

    public void setWeightsum(Integer weightsum) {
        this.weightsum = weightsum;
    }

    public Integer getVolumesum() {
        return volumesum;
    }

    public void setVolumesum(Integer volumesum) {
        this.volumesum = volumesum;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAsk() {
        return ask;
    }

    public void setAsk(Integer ask) {
        this.ask = ask;
    }
}