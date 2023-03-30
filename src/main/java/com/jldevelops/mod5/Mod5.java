/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jldevelops.mod5;

/**
 *
 * @author Johnson
 */
public class Mod5 {

    public static void main(String[] args) {
        CommissionEmployee employee1 = new CommissionEmployee("John", "Doe", "123-45-6789", 10000, 0.2);
        System.out.println(employee1.toString());
        System.out.printf("Earnings: $%.2f%n%n", employee1.earnings());

        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("Jane", "Doe", "987-65-4321", 15000, 0.3, 2000);
        System.out.println(employee2.toString());
        System.out.printf("Earnings: $%.2f%n%n", employee2.earnings());

        // test setting base salary
        employee2.setBaseSalary(3000);
        System.out.println("New Base Salary: " + employee2.getBaseSalary());
        System.out.printf("New Earnings: $%.2f%n%n", employee2.earnings());
        // test hourly employee
        HourlyEmployee employee = new HourlyEmployee("James", "Doe", "523-45-6789", 15.0, 50.0);
 
        System.out.println("Employee information:");
        System.out.println(employee);
        System.out.printf("%n%s %.2f%n", "Earnings for the week are", employee.earnings());
    
    }
}
