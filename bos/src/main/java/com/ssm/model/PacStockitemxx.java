package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PacStockitemxx {
    private Integer id;
    //工作单号
    private String worksheetno;
    //品名
    private String warename;
    //发货方式
    private String modeofdespatch;
    //包装单位
    private String packingunit;
    //入库人
    private String storageperson;
    //入库时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date storagedate;
    //包装员
    private String packingclerk;
    //出库人
    private String thedeliveryman;
    //出库时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date outbounddate;

    public PacStockitemxx(String worksheetno, String warename, String modeofdespatch, String packingunit, String storageperson, Date storagedate, String packingclerk, String thedeliveryman, Date outbounddate) {
        this.worksheetno = worksheetno;
        this.warename = warename;
        this.modeofdespatch = modeofdespatch;
        this.packingunit = packingunit;
        this.storageperson = storageperson;
        this.storagedate = storagedate;
        this.packingclerk = packingclerk;
        this.thedeliveryman = thedeliveryman;
        this.outbounddate = outbounddate;
    }

    public PacStockitemxx() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno;
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
    }

    public String getModeofdespatch() {
        return modeofdespatch;
    }

    public void setModeofdespatch(String modeofdespatch) {
        this.modeofdespatch = modeofdespatch;
    }

    public String getPackingunit() {
        return packingunit;
    }

    public void setPackingunit(String packingunit) {
        this.packingunit = packingunit;
    }

    public String getStorageperson() {
        return storageperson;
    }

    public void setStorageperson(String storageperson) {
        this.storageperson = storageperson;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public Date getStoragedate() {
        return storagedate;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    public void setStoragedate(Date storagedate) {
        this.storagedate = storagedate;
    }

    public String getPackingclerk() {
        return packingclerk;
    }

    public void setPackingclerk(String packingclerk) {
        this.packingclerk = packingclerk;
    }

    public String getThedeliveryman() {
        return thedeliveryman;
    }

    public void setThedeliveryman(String thedeliveryman) {
        this.thedeliveryman = thedeliveryman;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getOutbounddate() {
        return outbounddate;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setOutbounddate(Date outbounddate) {
        this.outbounddate = outbounddate;
    }

    @Override
    public String toString() {
        return "PacStockitemxx{" +
                "id=" + id +
                ", worksheetno='" + worksheetno + '\'' +
                ", warename='" + warename + '\'' +
                ", modeofdespatch='" + modeofdespatch + '\'' +
                ", packingunit='" + packingunit + '\'' +
                ", storageperson='" + storageperson + '\'' +
                ", storagedate=" + storagedate +
                ", packingclerk='" + packingclerk + '\'' +
                ", thedeliveryman='" + thedeliveryman + '\'' +
                ", outbounddate=" + outbounddate +
                '}';
    }
}
