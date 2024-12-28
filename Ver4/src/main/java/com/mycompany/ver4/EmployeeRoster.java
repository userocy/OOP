package com.mycompany.ver4;


import com.mycompany.ver4.Employee;
import com.mycompany.ver4.CommissionEmployee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oceane
 */
public class EmployeeRoster {
    private final Employee[] empList;
    private int count;
    private final int max;

    public EmployeeRoster(int max) {
        empList = new Employee[max];
        count = 0;
        this.max = max;
    }

    public void setEmployee(Employee e, int idx) {
        empList[idx] = e;
    }

    public Employee getEmployee(int idx) {
        return empList[idx];
    }

    public boolean addEmployee(Employee e) {
        if (count < max) {
            empList[count++] = e;
            return true;
        }
        return false;
    }

    public Employee removeEmployee(int id) {
        Employee e;
        for (int i = 0; i < count; i++) {
            if (id == empList[i].getEmpID()) {
                e = empList[i];
                for (int j = i; j + 1 < count; j++) {
                    empList[j] = empList[j + 1];
                }
                count -= i + 1;
                return e;
            }
        }
        return new Employee();
    }

    public int countHE() {
        int emp_count = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                emp_count++;
            } else {
            }
        }
        return emp_count;
    }

    public int countCE() {
        int emp_count = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof CommissionEmployee) {
                emp_count++;
            }
        }
        return emp_count;
    }

    public int countBPCE() {
        int emp_count = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                emp_count++;
            }
        }
        return emp_count;
    }

    public int countPWE() {
        int emp_count = 0;
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                emp_count++;
            }
        }
        return emp_count;
    }

    public void displayHE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof HourlyEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpDOB(), empList[i].getEmpDOJ(), ((HourlyEmployee) empList[i]).computeSalary());
            }
        }
    }

    public void displayCE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof CommissionEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpDOB(), empList[i].getEmpDOJ(), ((CommissionEmployee) empList[i]).computeSalary());
            }
        }
    }

    public void displayBPCE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof BasePlusCommissionEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpDOB(), empList[i].getEmpDOJ(), ((BasePlusCommissionEmployee) empList[i]).computeSalary());
            }
        }
    }

    public void displayPWE() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary");
        for (int i = 0; i < count; i++) {
            if (empList[i] instanceof PieceWorkerEmployee) {
                System.out.printf("%-10d %-20s %-14s %-14s %-14.2f\n", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpDOB(), empList[i].getEmpDOJ(), ((PieceWorkerEmployee) empList[i]).computeSalary());
            }
        }
    }

    public void displayAllEmployees() {
        System.out.printf("%-10s %-20s %-14s %-14s %-14s %-32s\n", "ID", "Name", "Date Joined", "Birth Date", "Salary", "Type of Employee");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-10d %-20s %-14s %-14s", empList[i].getEmpID(), empList[i].getEmpName(), empList[i].getEmpDOB(), empList[i].getEmpDOJ());
            if (empList[i] instanceof HourlyEmployee) {
                System.out.printf("%-14.2f ", ((HourlyEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof PieceWorkerEmployee) {
                System.out.printf("%-14.2f ", ((PieceWorkerEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof CommissionEmployee) {
                System.out.printf("%-14.2f ", ((CommissionEmployee) empList[i]).computeSalary());
            } else if (empList[i] instanceof BasePlusCommissionEmployee) {
                System.out.printf("%-14.2f ", ((BasePlusCommissionEmployee) empList[i]).computeSalary());
            }
            
            System.out.printf("%-32s\n", empList[i].getClass().getSimpleName());
        }
    }
}