package com.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class IaeLineresource {
    private String id;

    private String resourcetype;

    private String port;

    private Short demand;

    private String vehicleint;

    private String capacity;

    private String waybillid;

    private String carrier;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

    private Date expectarrivaldate;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

    private Date expectdeparturedate;

    private Short ticket;

    private Short cargo;

    private Short weight;

    private Short volume;

    private String handleperson;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

    private Date handledate;

    private Short enterperson;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

    private Date enterdate;

    private String entercompany;

    private Short acceptperson;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

    private Date acceptdate;

    private String acceptcompany;

    private String abnormalremarks;

    private String workint;

    private Short actualcount;

    private String destination;

    private String warename;

    private Short actualvolume;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

    private Date timelimit;

    private String ask;

    private String takecargoperson;

    private String tackcargoaddress;

    private Short payment;

    private String specialensure;

    private Short deliverytype;

    private String importanthints;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")

    private Date surplustime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getResourcetype() {
        return resourcetype;
    }

    public void setResourcetype(String resourcetype) {
        this.resourcetype = resourcetype == null ? null : resourcetype.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public Short getDemand() {
        return demand;
    }

    public void setDemand(Short demand) {
        this.demand = demand;
    }

    public String getVehicleint() {
        return vehicleint;
    }

    public void setVehicleint(String vehicleint) {
        this.vehicleint = vehicleint == null ? null : vehicleint.trim();
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity == null ? null : capacity.trim();
    }

    public String getWaybillid() {
        return waybillid;
    }

    public void setWaybillid(String waybillid) {
        this.waybillid = waybillid;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier == null ? null : carrier.trim();
    }

    public Date getExpectarrivaldate() {
        return expectarrivaldate;
    }

    public void setExpectarrivaldate(Date expectarrivaldate) {
        this.expectarrivaldate = expectarrivaldate;
    }

    public Date getExpectdeparturedate() {
        return expectdeparturedate;
    }

    public void setExpectdeparturedate(Date expectdeparturedate) {
        this.expectdeparturedate = expectdeparturedate;
    }

    public Short getTicket() {
        return ticket;
    }

    public void setTicket(Short ticket) {
        this.ticket = ticket;
    }

    public Short getCargo() {
        return cargo;
    }

    public void setCargo(Short cargo) {
        this.cargo = cargo;
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

    public String getHandleperson() {
        return handleperson;
    }

    public void setHandleperson(String handleperson) {
        this.handleperson = handleperson == null ? null : handleperson.trim();
    }

    public Date getHandledate() {
        return handledate;
    }

    public void setHandledate(Date handledate) {
        this.handledate = handledate;
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

    public String getEntercompany() {
        return entercompany;
    }

    public void setEntercompany(String entercompany) {
        this.entercompany = entercompany == null ? null : entercompany.trim();
    }

    public Short getAcceptperson() {
        return acceptperson;
    }

    public void setAcceptperson(Short acceptperson) {
        this.acceptperson = acceptperson;
    }

    public Date getAcceptdate() {
        return acceptdate;
    }

    public void setAcceptdate(Date acceptdate) {
        this.acceptdate = acceptdate;
    }

    public String getAcceptcompany() {
        return acceptcompany;
    }

    public void setAcceptcompany(String acceptcompany) {
        this.acceptcompany = acceptcompany == null ? null : acceptcompany.trim();
    }

    public String getAbnormalremarks() {
        return abnormalremarks;
    }

    public void setAbnormalremarks(String abnormalremarks) {
        this.abnormalremarks = abnormalremarks == null ? null : abnormalremarks.trim();
    }

    public String getWorkint() {
        return workint;
    }

    public void setWorkint(String workint) {
        this.workint = workint == null ? null : workint.trim();
    }

    public Short getActualcount() {
        return actualcount;
    }

    public void setActualcount(Short actualcount) {
        this.actualcount = actualcount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename == null ? null : warename.trim();
    }

    public Short getActualvolume() {
        return actualvolume;
    }

    public void setActualvolume(Short actualvolume) {
        this.actualvolume = actualvolume;
    }

    public Date getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Date timelimit) {
        this.timelimit = timelimit;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask == null ? null : ask.trim();
    }

    public String getTakecargoperson() {
        return takecargoperson;
    }

    public void setTakecargoperson(String takecargoperson) {
        this.takecargoperson = takecargoperson == null ? null : takecargoperson.trim();
    }

    public String getTackcargoaddress() {
        return tackcargoaddress;
    }

    public void setTackcargoaddress(String tackcargoaddress) {
        this.tackcargoaddress = tackcargoaddress == null ? null : tackcargoaddress.trim();
    }

    public Short getPayment() {
        return payment;
    }

    public void setPayment(Short payment) {
        this.payment = payment;
    }

    public String getSpecialensure() {
        return specialensure;
    }

    public void setSpecialensure(String specialensure) {
        this.specialensure = specialensure == null ? null : specialensure.trim();
    }

    public Short getDeliverytype() {
        return deliverytype;
    }

    public void setDeliverytype(Short deliverytype) {
        this.deliverytype = deliverytype;
    }

    public String getImportanthints() {
        return importanthints;
    }

    public void setImportanthints(String importanthints) {
        this.importanthints = importanthints == null ? null : importanthints.trim();
    }

    public Date getSurplustime() {
        return surplustime;
    }

    public void setSurplustime(Date surplustime) {
        this.surplustime = surplustime;
    }
}