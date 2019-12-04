package com.ssm.model;

import java.util.Date;

public class SorOutbound {
    private Integer id;

    private Short handovertype;

    private String line;

    private Short direction;

    private Short acceptperson;

    private Short carriers;

    private Short deliveryperson;

    private Date deliverydate;

    private String deliverycompany;

    private Short enterperson;

    private Date enterdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getHandovertype() {
        return handovertype;
    }

    public void setHandovertype(Short handovertype) {
        this.handovertype = handovertype;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public Short getDirection() {
        return direction;
    }

    public void setDirection(Short direction) {
        this.direction = direction;
    }

    public Short getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Short acceptperson) {
        this.acceptperson = acceptperson;
    }

    public Short getCarriers() {
        return carriers;
    }

    public void setCarriers(Short carriers) {
        this.carriers = carriers;
    }

    public Short getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Short deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }

    public Short getEnterperson() {
        return enterperson;
    }

    public void setEnterperson(Short enterperson) {
        this.enterperson = enterperson;
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }
}