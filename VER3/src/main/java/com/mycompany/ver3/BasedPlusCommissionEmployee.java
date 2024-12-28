/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class BasedPlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedPlusCommissionEmployee() {
        super();
    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, String fName, String mName, String lName){
        super(empID, fName, mName, lName);
    }

    public BasedPlusCommissionEmployee(String empName, int empID, double baseSalary, double totalSales) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, Name empName, double baseSalary, double totalSales) {
        super(empID, empName.getFName(), empName.getMName(), empName.getLName());
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


    public void displayHourlyEmployee(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("Base Salary: $").append(getBaseSalary()).append("\n");
        sb.append("Total Sales: ").append(getTotalSales()).append("\n");
        sb.append("Salary: $").append(computeSalary()).append("\n");

        return sb.toString();
    }
}