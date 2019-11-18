package com.ssm.model;

public class SY_Emp {
    //创建的id
    //c_id;


    private Integer ID;
    private String EmpName;
    private String EmpNo;
    private String Pwd;
    private String QueryPwd;
    private Integer RoleID;
    private Integer EmpUnit;
    private String Remark;
    private Integer Disabled;
    private Sy_role emp_role;

    public Sy_role getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(Sy_role emp_role) {
        this.emp_role = emp_role;
    }

    @Override
    public String toString() {
        return "SY_Emp{" +
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

    public SY_Emp() {
    }

    public SY_Emp(Integer ID, String empName, String empNo, String pwd, String queryPwd, Integer roleID, Integer empUnit, String remark, Integer disabled) {
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

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
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

    public Integer getRoleID() {
        return RoleID;
    }

    public void setRoleID(Integer roleID) {
        RoleID = roleID;
    }

    public Integer getEmpUnit() {
        return EmpUnit;
    }

    public void setEmpUnit(Integer empUnit) {
        EmpUnit = empUnit;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public Integer getDisabled() {
        return Disabled;
    }

    public void setDisabled(Integer disabled) {
        Disabled = disabled;
    }
}
