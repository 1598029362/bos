package com.ssm.model;

import java.util.Date;

public class SorPackage {
    private Short id;

    private Short packageperson;

    private String sealint;

    private String destination;

    private String reckondes;

    private Date timelimit;

    private Short ticketsum;

    private Short cargosum;

    private Short weightsum;

    private Short volumesum;

    private Short state;

    private Short ask;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getPackageperson() {
        return packageperson;
    }

    public void setPackageperson(Short packageperson) {
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

    public Short getTicketsum() {
        return ticketsum;
    }

    public void setTicketsum(Short ticketsum) {
        this.ticketsum = ticketsum;
    }

    public Short getCargosum() {
        return cargosum;
    }

    public void setCargosum(Short cargosum) {
        this.cargosum = cargosum;
    }

    public Short getWeightsum() {
        return weightsum;
    }

    public void setWeightsum(Short weightsum) {
        this.weightsum = weightsum;
    }

    public Short getVolumesum() {
        return volumesum;
    }

    public void setVolumesum(Short volumesum) {
        this.volumesum = volumesum;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getAsk() {
        return ask;
    }

    public void setAsk(Short ask) {
        this.ask = ask;
    }
}