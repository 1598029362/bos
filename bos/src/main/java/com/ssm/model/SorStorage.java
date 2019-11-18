package com.ssm.model;

import java.util.Date;

public class SorStorage {
    private Short id;

    private Date acceptdate;

    private Short acceptperson;

    private String acceptcompany;

    private Short deliveryperson;

    private String deliverycompany;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public Short getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Short acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    public Short getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Short deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }
}