package com.ssm.model;

public class BasAssociatedaddress {
    private Short id;

    private String zonecode;

    private String city;

    private String customaddress;

    private Short associatedpartitions;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCustomaddress() {
        return customaddress;
    }

    public void setCustomaddress(String customaddress) {
        this.customaddress = customaddress == null ? null : customaddress.trim();
    }

    public Short getAssociatedpartitions() {
        return associatedpartitions;
    }

    public void setAssociatedpartitions(Short associatedpartitions) {
        this.associatedpartitions = associatedpartitions;
    }
}