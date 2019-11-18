package com.ssm.model;

public class SorPackagedetails {
    private Short id;

    private Short warename;

    private String destination;

    private Short ticket;

    private Short actualcargoint;

    private Short cargoint;

    private Short weight;

    private Short volume;

    private Short service;

    private String importanthints;

    private String ask;

    private String inputtype;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getWarename() {
        return warename;
    }

    public void setWarename(Short warename) {
        this.warename = warename;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Short getTicket() {
        return ticket;
    }

    public void setTicket(Short ticket) {
        this.ticket = ticket;
    }

    public Short getActualcargoint() {
        return actualcargoint;
    }

    public void setActualcargoint(Short actualcargoint) {
        this.actualcargoint = actualcargoint;
    }

    public Short getCargoint() {
        return cargoint;
    }

    public void setCargoint(Short cargoint) {
        this.cargoint = cargoint;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getVolume() {
        return volume;
    }

    public void setVolume(Short volume) {
        this.volume = volume;
    }

    public Short getService() {
        return service;
    }

    public void setService(Short service) {
        this.service = service;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getInputtype() {
        return inputtype;
    }

    public void setInputtype(String inputtype) {
        this.inputtype = inputtype == null ? null : inputtype.trim();
    }
}