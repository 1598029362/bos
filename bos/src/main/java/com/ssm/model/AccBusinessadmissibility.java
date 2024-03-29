package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AccBusinessadmissibility {
    private Short id;
    //统计
    private Short max;

    private String businessnoticeno;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date reservationtime;

    private String customname;

    private String pickupaddress;

    private String customcode;

    private String linkman;

    private String telphone;

    private Short weight;

    private Short volume;

    private String importanthints;

    private String arrivecity;

    private Short pickerinfo;

    private String sendaddress;

    private Short processingunit;

    private Short notificationsource;

    private Short customnomodifyflag;

    private String singletype;

    private Short packagesnum;

    private Short actualweight;

    private Short billingweight;

    private Short packingfee;

    private Short actualpacking;

    private String product;

    private BasZonecustominfo1 basZonecustominfo;

    private AccWorkorder accWorkorder;

    private String worksheetno;

    private BasAssociatemember basAssociatemember;

    //寄件人
    private String man;

    private SyUnits syUnits2;
    //收件人
    private  String person;

    private SyUnits syUnits;


    public SyUnits getSyUnits2() {
        return syUnits2;
    }

    public void setSyUnits2(SyUnits syUnits2) {
        this.syUnits2 = syUnits2;
    }

    public SyUnits getSyUnits() {
        return syUnits;
    }

    public void setSyUnits(SyUnits syUnits) {
        this.syUnits = syUnits;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public BasAssociatemember getBasAssociatemember() {
        return basAssociatemember;
    }

    public void setBasAssociatemember(BasAssociatemember basAssociatemember) {
        this.basAssociatemember = basAssociatemember;
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno;
    }

    @Override
    public String toString() {
        return "AccBusinessadmissibility{" +
                "id=" + id +
                ", max=" + max +
                ", businessnoticeno='" + businessnoticeno + '\'' +
                ", reservationtime=" + reservationtime +
                ", customname='" + customname + '\'' +
                ", pickupaddress='" + pickupaddress + '\'' +
                ", customcode='" + customcode + '\'' +
                ", linkman='" + linkman + '\'' +
                ", telphone='" + telphone + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                ", importanthints='" + importanthints + '\'' +
                ", arrivecity='" + arrivecity + '\'' +
                ", pickerinfo=" + pickerinfo +
                ", sendaddress='" + sendaddress + '\'' +
                ", processingunit=" + processingunit +
                ", notificationsource=" + notificationsource +
                ", customnomodifyflag=" + customnomodifyflag +
                ", singletype='" + singletype + '\'' +
                ", packagesnum=" + packagesnum +
                ", actualweight=" + actualweight +
                ", billingweight=" + billingweight +
                ", packingfee=" + packingfee +
                ", actualpacking=" + actualpacking +
                ", product='" + product + '\'' +
                ", basZonecustominfo=" + basZonecustominfo +
                ", accWorkorder=" + accWorkorder +
                ", worksheetno='" + worksheetno + '\'' +
                ", basAssociatemember=" + basAssociatemember +
                ", man='" + man + '\'' +
                ", person='" + person + '\'' +
                '}';
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public AccWorkorder getAccWorkorder() {
        return accWorkorder;
    }

    public void setAccWorkorder(AccWorkorder accWorkorder) {
        this.accWorkorder = accWorkorder;
    }

    public BasZonecustominfo1 getBasZonecustominfo() {
        return basZonecustominfo;
    }

    public void setBasZonecustominfo(BasZonecustominfo1 basZonecustominfo) {
        this.basZonecustominfo = basZonecustominfo;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getBusinessnoticeno() {
        return businessnoticeno;
    }

    public void setBusinessnoticeno(String businessnoticeno) {
        this.businessnoticeno = businessnoticeno == null ? null : businessnoticeno.trim();
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getReservationtime() {
        return reservationtime;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setReservationtime(Date reservationtime) {
        this.reservationtime = reservationtime;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public String getPickupaddress() {
        return pickupaddress;
    }

    public void setPickupaddress(String pickupaddress) {
        this.pickupaddress = pickupaddress == null ? null : pickupaddress.trim();
    }

    public String getCustomcode() {
        return customcode;
    }

    public void setCustomcode(String customcode) {
        this.customcode = customcode == null ? null : customcode.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Short getMax() {
        return max;
    }

    public void setMax(Short max) {
        this.max = max;
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

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public String getArrivecity() {
        return arrivecity;
    }

    public void setArrivecity(String arrivecity) {
        this.arrivecity = arrivecity == null ? null : arrivecity.trim();
    }

    public Short getPickerinfo() {
        return pickerinfo;
    }

    public void setPickerinfo(Short pickerinfo) {
        this.pickerinfo = pickerinfo;
    }

    public String getSendaddress() {
        return sendaddress;
    }

    public void setSendaddress(String sendaddress) {
        this.sendaddress = sendaddress == null ? null : sendaddress.trim();
    }

    public Short getProcessingunit() {
        return processingunit;
    }

    public void setProcessingunit(Short processingunit) {
        this.processingunit = processingunit;
    }

    public Short getNotificationsource() {
        return notificationsource;
    }

    public void setNotificationsource(Short notificationsource) {
        this.notificationsource = notificationsource;
    }

    public Short getCustomnomodifyflag() {
        return customnomodifyflag;
    }

    public void setCustomnomodifyflag(Short customnomodifyflag) {
        this.customnomodifyflag = customnomodifyflag;
    }

    public String getSingletype() {
        return singletype;
    }

    public void setSingletype(String singletype) {
        this.singletype = singletype == null ? null : singletype.trim();
    }

    public Short getPackagesnum() {
        return packagesnum;
    }

    public void setPackagesnum(Short packagesnum) {
        this.packagesnum = packagesnum;
    }

    public Short getActualweight() {
        return actualweight;
    }

    public void setActualweight(Short actualweight) {
        this.actualweight = actualweight;
    }

    public Short getBillingweight() {
        return billingweight;
    }

    public void setBillingweight(Short billingweight) {
        this.billingweight = billingweight;
    }

    public Short getPackingfee() {
        return packingfee;
    }

    public void setPackingfee(Short packingfee) {
        this.packingfee = packingfee;
    }

    public Short getActualpacking() {
        return actualpacking;
    }

    public void setActualpacking(Short actualpacking) {
        this.actualpacking = actualpacking;
    }
}