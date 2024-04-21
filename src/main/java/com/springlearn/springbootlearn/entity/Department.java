package com.springlearn.springbootlearn.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deptId;
    private String departmentName;
    private String departmentAddr;

    private String departmentCode;

    public Department() {
    }

    public Department(Long deptId, String departmentName, String departmentAddr, String departmentCode) {
        this.deptId = deptId;
        this.departmentName = departmentName;
        this.departmentAddr = departmentAddr;
        this.departmentCode = departmentCode;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddr() {
        return departmentAddr;
    }

    public void setDepartmentAddr(String departmentAddr) {
        this.departmentAddr = departmentAddr;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddr='" + departmentAddr + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
