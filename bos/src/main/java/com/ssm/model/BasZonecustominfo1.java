package com.ssm.model;

public class BasZonecustominfo1 {
    private Short customcode;

    private String customname;

    private String mobileno;

    private String cityname;

    private String cstomaddress;

    private String zoneinfoid;

    private String linkman;

    public BasZonecustominfo1(String customname, String mobileno, String cstomaddress, String linkman) {
        this.customname = customname;
        this.mobileno = mobileno;
        this.cstomaddress = cstomaddress;
        this.linkman = linkman;
    }


    public BasZonecustominfo1() {
    }


    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

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

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
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

    public String getZoneinfoid() {
        return zoneinfoid;
    }

    public void setZoneinfoid(String zoneinfoid) {
        this.zoneinfoid = zoneinfoid;
    }
}