package com.ssm.model;

public class LogLogistics {
    private Short id;

    private String logisticsint;

    private String linename;

    private String startcompany;

    private String generateperson;

    private String carint;

    private String driver;

    private String driverphone;

    private String cartype;

    private String logisticsstate;

    private Short iscancel;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getLogisticsint() {
        return logisticsint;
    }

    public void setLogisticsint(String logisticsint) {
        this.logisticsint = logisticsint == null ? null : logisticsint.trim();
    }

    public String getLinename() {
        return linename;
    }

    public void setLinename(String linename) {
        this.linename = linename == null ? null : linename.trim();
    }

    public String getStartcompany() {
        return startcompany;
    }

    public void setStartcompany(String startcompany) {
        this.startcompany = startcompany == null ? null : startcompany.trim();
    }

    public String getGenerateperson() {
        return generateperson;
    }

    public void setGenerateperson(String generateperson) {
        this.generateperson = generateperson == null ? null : generateperson.trim();
    }

    public String getCarint() {
        return carint;
    }

    public void setCarint(String carint) {
        this.carint = carint == null ? null : carint.trim();
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver == null ? null : driver.trim();
    }

    public String getDriverphone() {
        return driverphone;
    }

    public void setDriverphone(String driverphone) {
        this.driverphone = driverphone == null ? null : driverphone.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getLogisticsstate() {
        return logisticsstate;
    }

    public void setLogisticsstate(String logisticsstate) {
        this.logisticsstate = logisticsstate == null ? null : logisticsstate.trim();
    }

    public Short getIscancel() {
        return iscancel;
    }

    public void setIscancel(Short iscancel) {
        this.iscancel = iscancel;
    }
}