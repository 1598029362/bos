package com.ssm.model;

import java.util.Date;

public class SorAbnormal {
    private Short id;

    private Date launchdate;

    private String launchperson;

    private String launchcompany;

    private Short abnormaltype;

    private String transferint;

    private String cargoint;

    private String packageint;

    private Short hedgeabnint;

    private Short abostate;

    private Date handledate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Date getLaunchdate() {
        return launchdate;
    }

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

    public Date getHandledate() {
        return handledate;
    }

    public void setHandledate(Date handledate) {
        this.handledate = handledate;
    }
}