package com.ssm.model;

public class PacStockitem {
    private Short id;

    //入库单号
    private String warehouseno;

    //货物编码
    private String goodscode;

    //货物名称
    private String goodsname;

    //入库数量
    private Short storagenum;

    //实际数量
    private Short actualnum;

    //计划价格
    private Short plannedprice;

    //规格
    private String specifications;

    //类型
    private Short type;

    //状态
    private Short status;

    private PacStock pacStock;

    public PacStock getPacStock() {
        return pacStock;
    }

    public void setPacStock(PacStock pacStock) {
        this.pacStock = pacStock;
    }

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

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode == null ? null : goodscode.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Short getStoragenum() {
        return storagenum;
    }

    public void setStoragenum(Short storagenum) {
        this.storagenum = storagenum;
    }

    public Short getActualnum() {
        return actualnum;
    }

    public void setActualnum(Short actualnum) {
        this.actualnum = actualnum;
    }

    public Short getPlannedprice() {
        return plannedprice;
    }

    public void setPlannedprice(Short plannedprice) {
        this.plannedprice = plannedprice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}