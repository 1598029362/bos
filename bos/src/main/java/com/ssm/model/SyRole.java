package com.ssm.model;

import java.util.List;

public class SyRole {
    //sy_role_id
    private Short id;
    private String rolename;
    private String roledesc;
    private Short disabled;
    private List<SyEmp> role_emps;
    private String role_menus;


    public String getRole_menus() {
        return role_menus;
    }

    public void setRole_menus(String role_menus) {
        this.role_menus = role_menus;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public Short getDisabled() {
        return disabled;
    }

    public void setDisabled(Short disabled) {
        this.disabled = disabled;
    }

    public List<SyEmp> getRole_emps() {
        return role_emps;
    }

    public void setRole_emps(List<SyEmp> role_emps) {
        this.role_emps = role_emps;
    }

    public SyRole() {
    }


    @Override
    public String toString() {
        return "SyRole{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                ", disabled='" + disabled + '\'' +
                ", role_emps=" + role_emps +
                ", role_menus=" + role_menus +
                '}';
    }
}
