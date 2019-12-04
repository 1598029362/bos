package com.ssm.model;

public class SyRolesMenus {
    private Short id;

    private Short roleid;

    private Short menuid;

    public SyRolesMenus() {
    }

    public SyRolesMenus( Short menuid) {
        this.menuid = menuid;
    }

    public SyRolesMenus(Short roleid, Short menuid) {
        this.roleid = roleid;
        this.menuid = menuid;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getRoleid() {
        return roleid;
    }

    public void setRoleid(Short roleid) {
        this.roleid = roleid;
    }

    public Short getMenuid() {
        return menuid;
    }

    public void setMenuid(Short menuid) {
        this.menuid = menuid;
    }
}