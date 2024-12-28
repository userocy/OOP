/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ver4;

/**
 *
 * @author Oceane
 */
public class Ver4 {

    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster(10);
        roster.addEmployee(new HourlyEmployee(1, new Name("Wayne", "Alex"), new Date(2000, 1, 11), new Date(2024, 5, 10), 12.3f, 1.5));
        roster.addEmployee(new CommissionEmployee(2, new Name("Zuck", "Marc"), new Date(2001, 3, 3), new Date(2024, 5, 10), 100.15));
        roster.addEmployee(new BasePlusCommissionEmployee(3, new Name("Stan", "Michael", "James"), 100.2, 50.0));
        roster.displayAllEmployees();
        roster.removeEmployee(1);
        roster.displayAllEmployees();
        roster.setEmployee(new Employee(4, "Oceane", "Rim", "Dardare", 2004, 11, 04), 1);
        roster.displayAllEmployees();
    }
}
