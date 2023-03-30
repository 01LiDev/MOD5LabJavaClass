package com.jldevelops.mod5;
public class BasePlusCommissionEmployee {
    private final CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                                       String socialSecurityNumber, double grossSales,
                                       double commissionRate, double baseSalary) {
        this.commissionEmployee = new CommissionEmployee(firstName, lastName,
                socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return baseSalary + commissionEmployee.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), "base salary", getBaseSalary());
    }
}
