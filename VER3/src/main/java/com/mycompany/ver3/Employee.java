/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class Employee {
    private int empID;
    private Name empName;
    private MyDate empBirthDate;
    private MyDate empDateHired;

    public Employee() {
        this.empName = new Name();
        this.empBirthDate = new MyDate();
        this.empDateHired = new MyDate();
    }

    public Employee(int empID) {
        this.empID = empID;
        this.empName = new Name();
        this.empBirthDate = new MyDate();
        this.empDateHired = new MyDate();
    }

    public Employee(int empID, String fName, String lName) {
        this.empID = empID;
        this.empName = new Name(lName, fName);
        this.empBirthDate = new MyDate();
        this.empDateHired = new MyDate();
    }

    public Employee(int empID, String fName, String lName, String mName) {
        this.empID = empID;
        this.empName = new Name(lName, fName, mName);
        this.empBirthDate = new MyDate();
        this.empDateHired = new MyDate();
    }

    public Employee(int empID, String fName, String lName, String mName, int year, int month, int day) {
        this.empID = empID;
        this.empName = new Name(lName, fName, mName);
        this.empBirthDate = new MyDate(year, month, day);
        this.empDateHired = new MyDate();
    }

    public Employee(int empID, Name empName, MyDate empBirthDate, MyDate empDateHired) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empDateHired = empDateHired;
    }


    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String fName, String mName, String lName) {
        empName.setName(lName, fName, mName);
    }

    public String getEmpName() {
        return empName.toString();
    }

    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpDateBirth(int year, int month, int day) {
        empBirthDate.setMyDate(year, month, day);
    }

    public MyDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(int year, int month, int day) {
        empDateHired.setMyDate(year, month, day);
    }

    public void displayEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        sb.append("Employee Name: ").append(getEmpName()).append(("\n"));
        sb.append("Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Date of Birth: ").append(getEmpBirthDate().toString()).append("\n");
        sb.append("Date Hired: ").append(getEmpDateHired().toString()).append("\n");

        return sb.toString();
    }
}