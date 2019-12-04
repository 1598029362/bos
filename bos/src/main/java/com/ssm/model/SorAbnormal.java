package com.ssm.model;

import javax.persistence.Column;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SorAbnormal {
    @Override
    public String toString() {
        return "SorAbnormal{" +
                "id=" + id +
                ", launchdate=" + launchdate +
                ", launchperson='" + launchperson + '\'' +
                ", launchcompany='" + launchcompany + '\'' +
                ", abnormaltype=" + abnormaltype +
                ", transferint='" + transferint + '\'' +
                ", cargoint='" + cargoint + '\'' +
                ", packageint='" + packageint + '\'' +
                ", hedgeabnint=" + hedgeabnint +
                ", abostate=" + abostate +
                ", handledate=" + handledate +
                '}';
    }

    private Short id;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date launchdate;

    private String launchperson;

    private String launchcompany;

    private Short abnormaltype;

    private String transferint;

    private String cargoint;

    private String packageint;

    private Short hedgeabnint;

    private Short abostate;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date handledate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getLaunchdate() {
        return launchdate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setLaunchdate(Date launchdate) {
        this.launchdate = launchdate;
    }

    public String getLaunchperson() {
        return launchperson;
    }

    public void setLaunchperson(String launchperson) {
        this.launchperson = launchperson == null ? null : launchperson.trim();
    }

    public String getLaunchcompany() {
        return launchcompany;
    }

    public void setLaunchcompany(String launchcompany) {
        this.launchcompany = launchcompany == null ? null : launchcompany.trim();
    }

    public Short getAbnormaltype() {
        return abnormaltype;
    }

    public void setAbnormaltype(Short abnormaltype) {
        this.abnormaltype = abnormaltype;
    }

    public String getTransferint() {
        return transferint;
    }

    public void setTransferint(String transferint) {
        this.transferint = transferint == null ? null : transferint.trim();
    }

    public String getCargoint() {
        return cargoint;
    }

    public void setCargoint(String cargoint) {
        this.cargoint = cargoint == null ? null : cargoint.trim();
    }

    public String getPackageint() {
        return packageint;
    }

    public void setPackageint(String packageint) {
        this.packageint = packageint == null ? null : packageint.trim();
    }

    public Short getHedgeabnint() {
        return hedgeabnint;
    }

    public void setHedgeabnint(Short hedgeabnint) {
        this.hedgeabnint = hedgeabnint;
    }

    public Short getAbostate() {
        return abostate;
    }

    public void setAbostate(Short abostate) {
        this.abostate = abostate;
    }

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getHandledate() {
        return handledate;
    }
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }
}