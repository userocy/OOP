/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ver7;

/**
 *
 * @author Oceane
 */
import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster {
    private List<Employee> empList;

    public EmployeeRoster() {
        empList = new ArrayList<Employee>();
    }

    public boolean addEmployee(Employee e) {
        if (e != null) {
            empList.add(e);
            return true;
        }
        return false;
    }

    public Employee removeEmployee(int id) {
        for (int i = 0; i < empList.size(); i++) {
            if (id != empList.get(i).getEmpID()) {
                return empList.remove(i);
            }
        }
        return null;
    }

    public int countHE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countCE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countBPCE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                count++;
            }
        }
        return count;
    }

    public int countPWE() {
        int count = 0;
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                count++;
            }
        }
        return count;
    }

    public void displayHE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", emp.getEmpID(), emp.getEmpName(), emp.getEmpDOB(), emp.getEmpDOJ(), emp.computeSalary());
            }
        }
    }

    public void displayCE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", emp.getEmpID(), emp.getEmpName(), emp.getEmpDOB(), emp.getEmpDOJ(), emp.computeSalary());
            }
        }
    }

    public void displayBPCE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", emp.getEmpID(), emp.getEmpName(), emp.getEmpDOB(), emp.getEmpDOJ(), emp.computeSalary());
            }
        }
    }

    public void displayPWE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", emp.getEmpID(), emp.getEmpName(), emp.getEmpDOB(), emp.getEmpDOJ(), emp.computeSalary());
            }
        }
    }

    public void displayAllEmployees() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s %-32s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary", "Type of Employee");
        for (Employee emp : empList) {
            System.out.printf("%-10d %-20s %-14s %-14s %-14.2f %-32s\n", emp.getEmpID(), emp.getEmpName(), emp.getEmpDOB(), emp.getEmpDOJ(), emp.computeSalary(), emp.getClass().getSimpleName());
        }
    }
}