package com.ssm.model;

public class AccWorksheet {
    private Short id;

    private String worksheetno;

    private String destination;

    private String producttime;

    private Short total;

    private Short weight;

    private String stowagerequirements;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getProducttime() {
        return producttime;
    }

    public void setProducttime(String producttime) {
        this.producttime = producttime == null ? null : producttime.trim();
    }

    public Short getTotal() {
        return total;
    }

    public void setTotal(Short total) {
        this.total = total;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public String getStowagerequirements() {
        return stowagerequirements;
    }

    public void setStowagerequirements(String stowagerequirements) {
        this.stowagerequirements = stowagerequirements == null ? null : stowagerequirements.trim();
    }
}