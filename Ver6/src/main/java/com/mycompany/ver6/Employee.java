/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver6;

/**
 *
 * @author Oceane
 */
public abstract class Employee { // Use abstract classes
    private int empID;
    private Name empName;
    private Date empDOB; // Birthday
    private Date empDOJ; // Date joined

    public Employee() {
        this.empName = new Name();
        this.empDOB = new Date();
        this.empDOJ = new Date();
    }

    public Employee(int empID) {
        this.empID = empID;
        this.empName = new Name();
        this.empDOB = new Date();
        this.empDOJ = new Date();
    }

    public Employee(int empID, String fname, String lname) {
        this.empID = empID;
        this.empName = new Name(lname, fname);
        this.empDOB = new Date();
        this.empDOJ = new Date();
    }

    public Employee(int empID, String fname, String mname, String lname) {
        this.empID = empID;
        this.empName = new Name(lname, fname, mname);
        this.empDOB = new Date();
        this.empDOJ = new Date();
    }

    public Employee(int empID, String fname, String mname, String lname, int year, int month, int day) {
        this.empID = empID;
        this.empName = new Name(lname, fname, mname);
        this.empDOB = new Date(year, month, day);
        this.empDOJ = new Date();
    }

    public Employee (int empID, Name empName, Date empDOB, Date empDOJ) {
        this.empID = empID;
        this.empName = empName;
        this.empDOB = empDOB;
        this.empDOJ = empDOJ;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpName(String fname, String mname, String lname) {
        empName.setName(lname, fname, mname);
    }

    public String getEmpName() {
        return empName.toString();
    }

    public void setEmpDOB(int year, int month, int day) {
        empDOB.setDate(year, month, day);
    }

    public Date getEmpDOB() {
        return empDOB;
    }

    public void setEmpDOJ(int year, int month, int day) {
        empDOJ.setDate(year, month, day);
    }

    public Date getEmpDOJ() {
        return empDOJ;
    }

    public abstract double computeSalary();

    public void displayEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append("Employee ID: ").append(getEmpID()).append("\n")
            .append("Employee name: ").append(getEmpName()).append("\n")
            .append("Join date: ").append(empDOJ.toString()).append("\n")
            .append("Date of birth: ").append(empDOB.toString()).append("\n");
        return sb.toString();
    }
}
