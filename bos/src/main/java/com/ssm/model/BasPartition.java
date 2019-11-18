package com.ssm.model;

public class BasPartition {
    private Short id;

    private String province;

    private String city;

    private String county;

    private String zonecode;

    private String keyword;

    private Short startint;

    private Short terminateint;

    private Short sdint;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getZonecode() {
        return zonecode;
    }

    public void setZonecode(String zonecode) {
        this.zonecode = zonecode == null ? null : zonecode.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Short getStartint() {
        return startint;
    }

    public void setStartint(Short startint) {
        this.startint = startint;
    }

    public Short getTerminateint() {
        return terminateint;
    }

    public void setTerminateint(Short terminateint) {
        this.terminateint = terminateint;
    }

    public Short getSdint() {
        return sdint;
    }

    public void setSdint(Short sdint) {
        this.sdint = sdint;
    }
}