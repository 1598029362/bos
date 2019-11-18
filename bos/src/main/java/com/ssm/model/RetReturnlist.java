package com.ssm.model;

import java.util.Date;

public class RetReturnlist {
    private Short id;

    private String applicationno;

    private String worksheetno;

    private Short returntype;

    private String apremark;

    private Short aploss;

    private Date entrytime;

    private Short receivegunit;

    private Short invalidatesign;

    private Short returnunit;

    private Date recordingtime;

    private Short entryunit;

    private String personname;

    private Date confirmationtime;

    private Short confirmationunit;

    private String confirmationpersonname;

    private Short treatmentstate;

    private Short apreturnstatus;

    private Short identificationsign;

    private String handlingopinions;

    private String denialtype;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getApplicationno() {
        return applicationno;
    }

    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno == null ? null : applicationno.trim();
    }

    public String getWorksheetno() {
        return worksheetno;
    }

    public void setWorksheetno(String worksheetno) {
        this.worksheetno = worksheetno == null ? null : worksheetno.trim();
    }

    public Short getReturntype() {
        return returntype;
    }

    public void setReturntype(Short returntype) {
        this.returntype = returntype;
    }

    public String getApremark() {
        return apremark;
    }

    public void setApremark(String apremark) {
        this.apremark = apremark == null ? null : apremark.trim();
    }

    public Short getAploss() {
        return aploss;
    }

    public void setAploss(Short aploss) {
        this.aploss = aploss;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Short getReceivegunit() {
        return receivegunit;
    }

    public void setReceivegunit(Short receivegunit) {
        this.receivegunit = receivegunit;
    }

    public Short getInvalidatesign() {
        return invalidatesign;
    }

    public void setInvalidatesign(Short invalidatesign) {
        this.invalidatesign = invalidatesign;
    }

    public Short getReturnunit() {
        return returnunit;
    }

    public void setReturnunit(Short returnunit) {
        this.returnunit = returnunit;
    }

    public Date getRecordingtime() {
        return recordingtime;
    }

    public void setRecordingtime(Date recordingtime) {
        this.recordingtime = recordingtime;
    }

    public Short getEntryunit() {
        return entryunit;
    }

    public void setEntryunit(Short entryunit) {
        this.entryunit = entryunit;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public Date getConfirmationtime() {
        return confirmationtime;
    }

    public void setConfirmationtime(Date confirmationtime) {
        this.confirmationtime = confirmationtime;
    }

    public Short getConfirmationunit() {
        return confirmationunit;
    }

    public void setConfirmationunit(Short confirmationunit) {
        this.confirmationunit = confirmationunit;
    }

    public String getConfirmationpersonname() {
        return confirmationpersonname;
    }

    public void setConfirmationpersonname(String confirmationpersonname) {
        this.confirmationpersonname = confirmationpersonname == null ? null : confirmationpersonname.trim();
    }

    public Short getTreatmentstate() {
        return treatmentstate;
    }

    public void setTreatmentstate(Short treatmentstate) {
        this.treatmentstate = treatmentstate;
    }

    public Short getApreturnstatus() {
        return apreturnstatus;
    }

    public void setApreturnstatus(Short apreturnstatus) {
        this.apreturnstatus = apreturnstatus;
    }

    public Short getIdentificationsign() {
        return identificationsign;
    }

    public void setIdentificationsign(Short identificationsign) {
        this.identificationsign = identificationsign;
    }

    public String getHandlingopinions() {
        return handlingopinions;
    }

    public void setHandlingopinions(String handlingopinions) {
        this.handlingopinions = handlingopinions == null ? null : handlingopinions.trim();
    }

    public String getDenialtype() {
        return denialtype;
    }

    public void setDenialtype(String denialtype) {
        this.denialtype = denialtype == null ? null : denialtype.trim();
    }
}