package com.ssm.model;

public class BasSubstitute {
    private Short id;

    private String empno;

    private String empname;

    private Short mobileno;

    private Short type;

    private Short pda;

    private Short standardkg;

    private Short standardlength;

    private String models;

    private String plateint;

    private Short invalidatemark;

    private Short subordinateunit;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
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

    public Short getMobileno() {
        return mobileno;
    }

    public void setMobileno(Short mobileno) {
        this.mobileno = mobileno;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getPda() {
        return pda;
    }

    public void setPda(Short pda) {
        this.pda = pda;
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

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getPlateint() {
        return plateint;
    }

    public void setPlateint(String plateint) {
        this.plateint = plateint == null ? null : plateint.trim();
    }

    public Short getInvalidatemark() {
        return invalidatemark;
    }

    public void setInvalidatemark(Short invalidatemark) {
        this.invalidatemark = invalidatemark;
    }

    public Short getSubordinateunit() {
        return subordinateunit;
    }

    public void setSubordinateunit(Short subordinateunit) {
        this.subordinateunit = subordinateunit;
    }
}