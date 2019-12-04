package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PacStock {
    private Integer id;

    @Override
    public String toString() {
        return "PacStock{" +
                "id=" + id +
                ", warehouseno='" + warehouseno + '\'' +
                ", reservoirtype=" + reservoirtype +
                ", transport='" + transport + '\'' +
                ", subordinateunit='" + subordinateunit + '\'' +
                ", drawerno=" + drawerno +
                ", drawername='" + drawername + '\'' +
                ", drawertime=" + drawertime +
                ", remark='" + remark + '\'' +
                '}';
    }

    public PacStock() {
    }

    public PacStock(Integer id, String warehouseno, Integer reservoirtype, String transport, String subordinateunit, Integer drawerno, String drawername, Date drawertime, String remark) {
        this.id = id;
        this.warehouseno = warehouseno;
        this.reservoirtype = reservoirtype;
        this.transport = transport;
        this.subordinateunit = subordinateunit;
        this.drawerno = drawerno;
        this.drawername = drawername;
        this.drawertime = drawertime;
        this.remark = remark;
    }


    private String warehouseno;

    private Integer reservoirtype;

    private String transport;

    private String subordinateunit;//一对一列对应

    private Integer drawerno;

    private String drawername;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date drawertime;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehouseno() {
        return warehouseno;
    }

    public void setWarehouseno(String warehouseno) {
        this.warehouseno = warehouseno == null ? null : warehouseno.trim();
    }

    public Integer getReservoirtype() {
        return reservoirtype;
    }

    public void setReservoirtype(Integer reservoirtype) {
        this.reservoirtype = reservoirtype;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport == null ? null : transport.trim();
    }

    public String getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(String subordinateunit) {
        this.subordinateunit = subordinateunit == null ? null : subordinateunit.trim();
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
        this.drawername = drawername == null ? null : drawername.trim();
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getDrawertime() {
        return drawertime;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setDrawertime(Date drawertime) {
        this.drawertime = drawertime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}