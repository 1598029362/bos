package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SorOutbound {
    private String emp1;
    private  String emp2;
    private  String jjdlx;
    private  String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getJjdlx() {
        return jjdlx;
    }

    public void setJjdlx(String jjdlx) {
        this.jjdlx = jjdlx;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany;
    }

    private  String acceptcompany;



    public String getEmp3() {
        return emp3;
    }

    public void setEmp3(String emp3) {
        this.emp3 = emp3;
    }

    private  String emp3;
    public String getEmp1() {
        return emp1;
    }

    public void setEmp1(String emp1) {
        this.emp1 = emp1;
    }

    public String getEmp2() {
        return emp2;
    }

    public void setEmp2(String emp2) {
        this.emp2 = emp2;
    }



    private Short id;

    private Short handovertype;

    private String line;

    private Short direction;

    private Short acceptperson;

    private Short carriers;

    private Short deliveryperson;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deliverydate;

    private String deliverycompany;

    private Short enterperson;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date enterdate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
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
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getDeliverydate() {
        return deliverydate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
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
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getEnterdate() {
        return enterdate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    @Override
    public String toString() {
        return "SorOutbound{" +
                "emp1='" + emp1 + '\'' +
                ", emp2='" + emp2 + '\'' +
                ", emp3='" + emp3 + '\'' +
                ", id=" + id +
                ", handovertype=" + handovertype +
                ", line='" + line + '\'' +
                ", direction=" + direction +
                ", acceptperson=" + acceptperson +
                ", carriers=" + carriers +
                ", deliveryperson=" + deliveryperson +
                ", deliverydate=" + deliverydate +
                ", deliverycompany='" + deliverycompany + '\'' +
                ", enterperson=" + enterperson +
                ", enterdate=" + enterdate +
                '}';
    }
}