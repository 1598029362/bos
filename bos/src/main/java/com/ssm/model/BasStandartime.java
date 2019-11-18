package com.ssm.model;

import java.util.Date;

public class BasStandartime {
    private Short id;

    private String timename;

    private Short subordinateunit;

    private Date workingtime;

    private Date closingtime;

    private Date saturdayworkingtime;

    private Date saturdayclosingtime;

    private Date sundayworkingtime;

    private Date sundayclosingtime;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTimename() {
        return timename;
    }

    public void setTimename(String timename) {
        this.timename = timename == null ? null : timename.trim();
    }

    public Short getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Short subordinateunit) {
        this.subordinateunit = subordinateunit;
    }

    public Date getWorkingtime() {
        return workingtime;
    }

    public void setWorkingtime(Date workingtime) {
        this.workingtime = workingtime;
    }

    public Date getClosingtime() {
        return closingtime;
    }

    public void setClosingtime(Date closingtime) {
        this.closingtime = closingtime;
    }

    public Date getSaturdayworkingtime() {
        return saturdayworkingtime;
    }

    public void setSaturdayworkingtime(Date saturdayworkingtime) {
        this.saturdayworkingtime = saturdayworkingtime;
    }

    public Date getSaturdayclosingtime() {
        return saturdayclosingtime;
    }

    public void setSaturdayclosingtime(Date saturdayclosingtime) {
        this.saturdayclosingtime = saturdayclosingtime;
    }

    public Date getSundayworkingtime() {
        return sundayworkingtime;
    }

    public void setSundayworkingtime(Date sundayworkingtime) {
        this.sundayworkingtime = sundayworkingtime;
    }

    public Date getSundayclosingtime() {
        return sundayclosingtime;
    }

    public void setSundayclosingtime(Date sundayclosingtime) {
        this.sundayclosingtime = sundayclosingtime;
    }
}