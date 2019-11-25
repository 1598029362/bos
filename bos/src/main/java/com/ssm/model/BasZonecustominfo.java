package com.ssm.model;

public class BasZonecustominfo {
    private Short customcode;

    private String customname;

    private Short mobileno;

    private String cityname;

    private String cstomaddress;

    private Short zoneinfoid;

    public Short getCustomcode() {
        return customcode;
    }

    public void setCustomcode(Short customcode) {
        this.customcode = customcode;
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public Short getMobileno() {
        return mobileno;
    }

    public void setMobileno(Short mobileno) {
        this.mobileno = mobileno;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }

    public String getCstomaddress() {
        return cstomaddress;
    }

    public void setCstomaddress(String cstomaddress) {
        this.cstomaddress = cstomaddress == null ? null : cstomaddress.trim();
    }

    public Short getZoneinfoid() {
        return zoneinfoid;
    }

    public BasZonecustominfo() {
    }

    public void setZoneinfoid(Short zoneinfoid) {
        this.zoneinfoid = zoneinfoid;
    }
}