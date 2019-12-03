package com.ssm.model;

import java.util.Date;

public class PacStock {
    private Short id;

    public PacStock() {
    }

    public PacStock(Short id, String warehouseno, Integer reservoirtype, String transport, String subordinateunit, Short drawerno, String drawername, Date drawertime, String remark) {
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

    private String warehouseno;

    private Integer reservoirtype;

    private String transport;

    private String subordinateunit;

    private Short drawerno;

    private String drawername;

    private Date drawertime;

    private String remark;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
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

    public Short getDrawerno() {
        return drawerno;
    }

    public void setDrawerno(Short drawerno) {
        this.drawerno = drawerno;
    }

    public String getDrawername() {
        return drawername;
    }

    public void setDrawername(String drawername) {
        this.drawername = drawername == null ? null : drawername.trim();
    }

    public Date getDrawertime() {
        return drawertime;
    }

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