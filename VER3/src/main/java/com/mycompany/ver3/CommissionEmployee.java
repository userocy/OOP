/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class CommissionEmployee extends Employee{
    private double totalSales;


    public CommissionEmployee(){
      super();
    }

    public CommissionEmployee(int empID){
        super(empID);
    }

    public CommissionEmployee(int empID, String fName, String mName, String lName){
        super(empID, fName, mName,lName);
    }

    public CommissionEmployee(int empID, Name empName, MyDate  empBirthDate, MyDate empDateHired)  {
        super(empID, empName, empBirthDate, empDateHired);
    }

    public CommissionEmployee(int empID, Name empName, MyDate  empBirthDate, MyDate empDateHired, double totalSales)  {
        super(empID, empName, empBirthDate, empDateHired);
        this.totalSales = totalSales;
    }



    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {
        double rate;

        if (this.totalSales < 10000) {
            rate = 0.05;
        } else if (this.totalSales >= 10000 && this.totalSales < 100000) {
            rate = 0.10;
        } else if (this.totalSales < 1000000) {
            rate = 0.20;
        } else {
            rate = 0.30;
        }


        return rate * totalSales;

    }


    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("Total sales: ").append(getTotalSales()).append("\n");
        sb.append("Salary: $").append(computeSalary()).append("\n");

        return sb.toString();
    }
}