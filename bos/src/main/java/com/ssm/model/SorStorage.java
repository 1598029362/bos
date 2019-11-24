package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SorStorage {
   private String list;
   private String emp1;
   private  String emp2;

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

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    private Long id;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date acceptdate;

    private Integer acceptperson;

    private String acceptcompany;

    private Integer deliveryperson;

    private String deliverycompany;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "SorStorage{" +
                "id=" + id +
                ", acceptdate=" + acceptdate +
                ", acceptperson=" + acceptperson +
                ", acceptcompany='" + acceptcompany + '\'' +
                ", deliveryperson=" + deliveryperson +
                ", deliverycompany='" + deliverycompany + '\'' +
                '}';
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getAcceptdate() {
        return acceptdate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public Integer getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Integer acceptperson) {
        this.acceptperson = acceptperson;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    public Integer getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(Integer deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public String getDeliverycompany() {
        return deliverycompany;
    }

    public void setDeliverycompany(String deliverycompany) {
        this.deliverycompany = deliverycompany == null ? null : deliverycompany.trim();
    }
}