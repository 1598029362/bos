package com.ssm.model;

public class Substitute {
    private Integer id;
    private String empNo;
    private String empName;
    private Integer mobileNo;
    private Integer type;
    private Integer PDA;
    private Double standardKg;
    private Double standardLength;

    private String models;
    private String plateInt;
    private Integer invalidateMark;
    private Integer subordinateUnit;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Integer mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPDA() {
        return PDA;
    }

    public void setPDA(Integer PDA) {
        this.PDA = PDA;
    }

    public Double getStandardKg() {
        return standardKg;
    }

    public void setStandardKg(Double standardKg) {
        this.standardKg = standardKg;
    }

    public Double getStandardLength() {
        return standardLength;
    }

    public void setStandardLength(Double standardLength) {
        this.standardLength = standardLength;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getPlateInt() {
        return plateInt;
    }

    public void setPlateInt(String plateInt) {
        this.plateInt = plateInt;
    }

    public Integer getInvalidateMark() {
        return invalidateMark;
    }

    public void setInvalidateMark(Integer invalidateMark) {
        this.invalidateMark = invalidateMark;
    }

    public Integer getSubordinateUnit() {
        return subordinateUnit;
    }

    public void setSubordinateUnit(Integer subordinateUnit) {
        this.subordinateUnit = subordinateUnit;
    }

    @Override
    public String toString() {
        return "Substitute{" +
                "id=" + id +
                ", empNo='" + empNo + '\'' +
                ", empName='" + empName + '\'' +
                ", mobileNo=" + mobileNo +
                ", type=" + type +
                ", PDA=" + PDA +
                ", standardKg=" + standardKg +
                ", standardLength=" + standardLength +
                ", models='" + models + '\'' +
                ", plateInt='" + plateInt + '\'' +
                ", invalidateMark=" + invalidateMark +
                ", subordinateUnit=" + subordinateUnit +
                '}';
    }
}
