/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jldevelops.mod5;

/**
 *
 * @author Johnson
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) {
            throw new IllegalArgumentException("Wage must be non-negative");
        }
        this.wage = wage;
    }

    public double earnings() {
        if (hours <= 40) {
            return hours * wage;
        } else {
            return 40 * wage + (hours - 40) * wage * 1.5;
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly employee: %s%nHours worked: %.2f%nWage per hour: $%.2f",
                super.toString(), hours, wage);
    }
}
