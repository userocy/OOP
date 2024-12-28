/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver4;

/**
 *
 * @author Oceane
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
    }

    public BasePlusCommissionEmployee(double totalSales, double baseSalary) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, String fname, String mname, String lname) {
        super(empID, fname, mname, lname);
    }

    public BasePlusCommissionEmployee(String empName, int empID, double baseSalary, double totalSales) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(int empID, Name empName, double totalSales, double baseSalary) {
        super(empID, empName.getFname(), empName.getMname(), empName.getLname());
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }

    public void displayHourlyEmployee() {
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append(super.toString())
            .append("Base salary: ").append(getBaseSalary()).append("\n")
            .append("Total sales: ").append(super.getTotalSales()).append("\n");
        return sb.toString();
    }
}