package com.ssm.model;

public class SyEmp {
    //创建的id
    //c_id;


    private Short ID;
    private String EmpName;
    private String EmpNo;
    private String Pwd;
    private String QueryPwd;
    private Short RoleID;
    private Short EmpUnit;
    private String Remark;
    private Short Disabled;
    private SyRole emp_role;


    public SyRole getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(SyRole emp_role) {
        this.emp_role = emp_role;
    }

    @Override
    public String toString() {
        return "SyEmp{" +
                "ID=" + ID +
                ", EmpName='" + EmpName + '\'' +
                ", EmpNo='" + EmpNo + '\'' +
                ", Pwd='" + Pwd + '\'' +
                ", QueryPwd='" + QueryPwd + '\'' +
                ", RoleID=" + RoleID +
                ", EmpUnit=" + EmpUnit +
                ", Remark='" + Remark + '\'' +
                ", Disabled=" + Disabled +
                '}';
    }

    public SyEmp() {
    }

    public SyEmp(Short ID, String empName, String empNo, String pwd, String queryPwd, Short roleID, Short empUnit, String remark, Short disabled) {
        this.ID = ID;
        EmpName = empName;
        EmpNo = empNo;
        Pwd = pwd;
        QueryPwd = queryPwd;
        RoleID = roleID;
        EmpUnit = empUnit;
        Remark = remark;
        Disabled = disabled;
    }


    public Short getID() {
        return ID;
    }

    public void setID(Short ID) {
        this.ID = ID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(String empNo) {
        EmpNo = empNo;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public String getQueryPwd() {
        return QueryPwd;
    }

    public void setQueryPwd(String queryPwd) {
        QueryPwd = queryPwd;
    }

    public Short getRoleID() {
        return RoleID;
    }

    public void setRoleID(Short roleID) {
        RoleID = roleID;
    }

    public Short getEmpUnit() {
        return EmpUnit;
    }

    public void setEmpUnit(Short empUnit) {
        EmpUnit = empUnit;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Short getDisabled() {
        return Disabled;
    }

    public void setDisabled(Short disabled) {
        Disabled = disabled;
    }
}
