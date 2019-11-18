package com.ssm.model;

import java.util.List;

public class Sy_role {
    //sy_role_id
    private Integer id;
    private String rolename;
    private String roledesc;
    private String disabled;
    private List<SY_Emp> role_emps;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public List<SY_Emp> getRole_emps() {
        return role_emps;
    }

    public void setRole_emps(List<SY_Emp> role_emps) {
        this.role_emps = role_emps;
    }

    public Sy_role() {
    }

    public Sy_role(Integer id, String rolename, String roledesc, String disabled) {
        this.id = id;
        this.rolename = rolename;
        this.roledesc = roledesc;
        this.disabled = disabled;
    }

    @Override
    public String toString() {
        return "Sy_role{" +
                "id=" + id +
                ", rolename='" + rolename + '\'' +
                ", roledesc='" + roledesc + '\'' +
                ", disabled='" + disabled + '\'' +
                '}';
    }
}
