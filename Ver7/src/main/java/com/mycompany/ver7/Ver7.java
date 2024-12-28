/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ver7;

/**
 *
 * @author Oceane
 */
public class Ver7 {

    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();
        roster.addEmployee(new HourlyEmployee(1, new Name("Doe", "John"), new Date(2003, 10, 1), new Date(2024, 6, 3), 12.3f, 1.5));
        roster.addEmployee(new CommissionEmployee(2, new Name("Doe", "John"), new Date(2003, 10, 1), new Date(2024, 6, 3), 100.15));
        roster.addEmployee(new BasePlusCommissionEmployee(3, new Name("Doe", "John", "Pierre"), 100.2, 50.0));
        roster.displayAllEmployees();
    }
}
