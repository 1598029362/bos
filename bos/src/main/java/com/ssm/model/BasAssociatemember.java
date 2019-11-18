package com.ssm.model;

import java.util.Date;

public class BasAssociatemember {
    private Short id;

    private String zonecode;

    private String empno;

    private String empname;

    private Short standardkg;

    private Short standardlength;

    private Date standardtime;

    private Short subordinateunit;

    private String type;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public Short getStandardkg() {
        return standardkg;
    }

    public void setStandardkg(Short standardkg) {
        this.standardkg = standardkg;
    }

    public Short getStandardlength() {
        return standardlength;
    }

    public void setStandardlength(Short standardlength) {
        this.standardlength = standardlength;
    }

    public Date getStandardtime() {
        return standardtime;
    }

    public void setStandardtime(Date standardtime) {
        this.standardtime = standardtime;
    }

    public Short getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Short subordinateunit) {
        this.subordinateunit = subordinateunit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}