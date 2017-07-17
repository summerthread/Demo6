package com.summer.a_hello;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/17.
 */
public class Employee {
    private int empId;
    private String empName;
    private Date workDate;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Date getWorkDate() {
        return workDate;
    }
    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }
}
