package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PacStockc {

    private Integer id;
    private String outboundno;//出库单号
    private Integer outboundtype;//出库类型
    private String transport;//运输单号
    private String suborinateunit;//所属单位
    private String issuedunit;//下发单位
    private String handlingunit;//经办人单位
    private Integer handlingnumber;//经办人编号
    private String handlingname;//经办人姓名
    private Integer customerid;//客户编号
    private String customername;//客户名称
    private Integer recipientnumber;//领用人
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date recipientname;//领用时间
    private Integer drawerno;//入户人
    private String drawername;//入户名称
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date drawertime;//入户时间


    public PacStockc(Integer id, String outboundno, Integer outboundtype, String transport, String suborinateunit, String issuedunit, String handlingunit, Integer handlingnumber, String handlingname, Integer customerid, String customername, Integer recipientnumber, Date recipientname, Integer drawerno, String drawername, Date drawertime) {
        this.id = id;
        this.outboundno = outboundno;
        this.outboundtype = outboundtype;
        this.transport = transport;
        this.suborinateunit = suborinateunit;
        this.issuedunit = issuedunit;
        this.handlingunit = handlingunit;
        this.handlingnumber = handlingnumber;
        this.handlingname = handlingname;
        this.customerid = customerid;
        this.customername = customername;
        this.recipientnumber = recipientnumber;
        this.recipientname = recipientname;
        this.drawerno = drawerno;
        this.drawername = drawername;
        this.drawertime = drawertime;
    }

    public PacStockc() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutboundno() {
        return outboundno;
    }

    public void setOutboundno(String outboundno) {
        this.outboundno = outboundno;
    }

    public Integer getOutboundtype() {
        return outboundtype;
    }

    public void setOutboundtype(Integer outboundtype) {
        this.outboundtype = outboundtype;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getSuborinateunit() {
        return suborinateunit;
    }

    public void setSuborinateunit(String suborinateunit) {
        this.suborinateunit = suborinateunit;
    }

    public String getIssuedunit() {
        return issuedunit;
    }

    public void setIssuedunit(String issuedunit) {
        this.issuedunit = issuedunit;
    }

    public String getHandlingunit() {
        return handlingunit;
    }

    public void setHandlingunit(String handlingunit) {
        this.handlingunit = handlingunit;
    }

    public Integer getHandlingnumber() {
        return handlingnumber;
    }

    public void setHandlingnumber(Integer handlingnumber) {
        this.handlingnumber = handlingnumber;
    }

    public String getHandlingname() {
        return handlingname;
    }

    public void setHandlingname(String handlingname) {
        this.handlingname = handlingname;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public Integer getRecipientnumber() {
        return recipientnumber;
    }

    public void setRecipientnumber(Integer recipientnumber) {
        this.recipientnumber = recipientnumber;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getRecipientname() {
        return recipientname;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setRecipientname(Date recipientname) {
        this.recipientname = recipientname;
    }

    public Integer getDrawerno() {
        return drawerno;
    }

    public void setDrawerno(Integer drawerno) {
        this.drawerno = drawerno;
    }

    public String getDrawername() {
        return drawername;
    }

    public void setDrawername(String drawername) {
        this.drawername = drawername;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getDrawertime() {
        return drawertime;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDrawertime(Date drawertime) {
        this.drawertime = drawertime;
    }

    @Override
    public String toString() {
        return "PacStockc{" +
                "id=" + id +
                ", outboundno='" + outboundno + '\'' +
                ", outboundtype=" + outboundtype +
                ", transport='" + transport + '\'' +
                ", suborinateunit='" + suborinateunit + '\'' +
                ", issuedunit='" + issuedunit + '\'' +
                ", handlingunit='" + handlingunit + '\'' +
                ", handlingnumber=" + handlingnumber +
                ", handlingname='" + handlingname + '\'' +
                ", customerid=" + customerid +
                ", customername='" + customername + '\'' +
                ", recipientnumber=" + recipientnumber +
                ", recipientname=" + recipientname +
                ", drawerno=" + drawerno +
                ", drawername='" + drawername + '\'' +
                ", drawertime=" + drawertime +
                '}';
    }
}
