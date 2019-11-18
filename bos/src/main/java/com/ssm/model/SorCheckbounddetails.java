package com.ssm.model;

import java.util.Date;

public class SorCheckbounddetails {
    private Short id;

    private String packageid;

    private Short cargocount;

    private Short weight;

    private Short volume;

    private Short cargotype;

    private String direction;

    private Short storageperson;

    private Date storagedate;

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

    public Short getCargocount() {
        return cargocount;
    }

    public void setCargocount(Short cargocount) {
        this.cargocount = cargocount;
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

    public Short getCargotype() {
        return cargotype;
    }

    public void setCargotype(Short cargotype) {
        this.cargotype = cargotype;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction == null ? null : direction.trim();
    }

    public Short getStorageperson() {
        return storageperson;
    }

    public void setStorageperson(Short storageperson) {
        this.storageperson = storageperson;
    }

    public Date getStoragedate() {
        return storagedate;
    }

    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }
}