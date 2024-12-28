/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver3;

/**
 *
 * @author Oceane
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(int empID, Name empName, MyDate empBirthDate, MyDate empDateHired, float totalHoursWorked, double ratePerHour) {
        super(empID, empName, empBirthDate, empDateHired);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, Name empName, MyDate empBirthDate, MyDate empDateHired, double ratePerHour) {
        super(empID, empName, empBirthDate, empDateHired);
        this.totalHoursWorked = 0;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, Name empName, MyDate empBirthDate, MyDate empDateHired, float totalHoursWorked) {
        super(empID, empName, empBirthDate, empDateHired);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = 0.0;
    }

    public HourlyEmployee(int empID, Name empName, MyDate empBirthDate, MyDate empDateHired) {
        super(empID, empName, empBirthDate, empDateHired);
        this.totalHoursWorked = 0;
        this.ratePerHour = 0.0;
    }



    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }


    public double computeSalary(){
        double salary = 0;

        if(totalHoursWorked <= 40){
            salary = totalHoursWorked * ratePerHour;
        }else{
            salary += ratePerHour * 40;
            totalHoursWorked -= 40;
            salary += 1.5 * totalHoursWorked;
        }

        return salary;
    }

    public void display(){
        System.out.println(this);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("Total hours worked: ").append(getTotalHoursWorked()).append("\n");
        sb.append("Rate per hour: ").append(getRatePerHour()).append("\n");
        sb.append("Salary: $").append(computeSalary()).append("\n");


        return sb.toString();
    }
}