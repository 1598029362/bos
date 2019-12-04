package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class IaeDeparture {
    private String id;

    private String packingid;

    private Short transfer;

    private Short actualcount;

    private String destination;

    private Short warename;

    private Short cargocount;

    private Short weight;

    private Short volume;

    private Short actualvolume;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date timelimit;

    private String ask;

    private String takecargoperson;

    private String tackcargoaddress;

    private Short payment;

    private String importanthints;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date surplustime;

    private String entrustcompany;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPackingid() {
        return packingid;
    }

    public void setPackingid(String packingid) {
        this.packingid = packingid == null ? null : packingid.trim();
    }

    public Short getTransfer() {
        return transfer;
    }

    public void setTransfer(Short transfer) {
        this.transfer = transfer;
    }

    public Short getActualcount() {
        return actualcount;
    }

    public void setActualcount(Short actualcount) {
        this.actualcount = actualcount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Short getWarename() {
        return warename;
    }

    public void setWarename(Short warename) {
        this.warename = warename;
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

    public Short getActualvolume() {
        return actualvolume;
    }

    public void setActualvolume(Short actualvolume) {
        this.actualvolume = actualvolume;
    }


   // @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getTimelimit() {
        return timelimit;
    }
   // @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getTakecargoperson() {
        return takecargoperson;
    }

    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson == null ? null : takecargoperson.trim();
    }

    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress == null ? null : tackcargoaddress.trim();
    }

    public Short getPayment() {
        return payment;
    }

    public void setPayment(Short payment) {
        this.payment = payment;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getSurplustime() {
        return surplustime;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setSurplustime(Date surplustime) {
        this.surplustime = surplustime;
    }

    public String getEntrustcompany() {
        return entrustcompany;
    }

    public void setEntrustcompany(String entrustcompany) {
        this.entrustcompany = entrustcompany == null ? null : entrustcompany.trim();
    }
}