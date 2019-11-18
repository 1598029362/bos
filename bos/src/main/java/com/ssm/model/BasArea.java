package com.ssm.model;

public class BasArea {
    private Short id;

    private String province;

    private String city;

    private String county;

    private Short postalcode;

    private String simplecode;

    private Short citycode;

    private String entryunitid;

    private String complementunitid;

    private Short nature;

    private Short thearea;

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

    public Short getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(Short postalcode) {
        this.postalcode = postalcode;
    }

    public String getSimplecode() {
        return simplecode;
    }

    public void setSimplecode(String simplecode) {
        this.simplecode = simplecode == null ? null : simplecode.trim();
    }

    public Short getCitycode() {
        return citycode;
    }

    public void setCitycode(Short citycode) {
        this.citycode = citycode;
    }

    public String getEntryunitid() {
        return entryunitid;
    }

    public void setEntryunitid(String entryunitid) {
        this.entryunitid = entryunitid == null ? null : entryunitid.trim();
    }

    public String getComplementunitid() {
        return complementunitid;
    }

    public void setComplementunitid(String complementunitid) {
        this.complementunitid = complementunitid == null ? null : complementunitid.trim();
    }

    public Short getNature() {
        return nature;
    }

    public void setNature(Short nature) {
        this.nature = nature;
    }

    public Short getThearea() {
        return thearea;
    }

    public void setThearea(Short thearea) {
        this.thearea = thearea;
    }
}