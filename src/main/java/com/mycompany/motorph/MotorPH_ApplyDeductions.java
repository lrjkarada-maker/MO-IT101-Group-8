/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.motorph;

/**
 *
 * @author admin
 */
public class MotorPH_ApplyDeductions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double grossSalary = 30000; // Example semi-monthly salary

        // Validate that salary is positive
        if (grossSalary <= 0) {
            System.out.println("Invalid salary amount. Salary must be positive.");
            return;
        }

        // Call method to compute net pay
        double netPay = computeNetPay(grossSalary);
    }

    // Method to compute SSS deduction
    // Accepts gross salary and returns deduction amount
    public static double computeSSS(double salary) {

        double sss = salary * 0.045; // Example 4.5% deduction
        return sss;
    }

    // Method to compute PhilHealth deduction
    public static double computePhilHealth(double salary) {

        double philhealth = salary * 0.02; // Example 2%
        return philhealth;
    }

    // Method to compute Pag-IBIG deduction
    public static double computePagIbig(double salary) {

        double pagibig = salary * 0.01; // Example 1%
        return pagibig;
    }

    // Method to compute Income Tax deduction
    public static double computeIncomeTax(double salary) {

        double tax = salary * 0.10; // Example 10%
        return tax;
    }

    // Method to compute Net Pay
    // Calls all deduction methods and subtracts them from gross salary
    public static double computeNetPay(double salary) {

        double sss = computeSSS(salary);
        double philhealth = computePhilHealth(salary);
        double pagibig = computePagIbig(salary);
        double tax = computeIncomeTax(salary);

        double totalDeductions = sss + philhealth + pagibig + tax;

        double netPay = salary - totalDeductions;

        // Display payroll summary
        System.out.println("----- MotorPH Payroll Summary -----");
        System.out.println("Gross Salary: " + salary);
        System.out.println("SSS Deduction: " + sss);
        System.out.println("PhilHealth Deduction: " + philhealth);
        System.out.println("Pag-IBIG Deduction: " + pagibig);
        System.out.println("Income Tax: " + tax);
        System.out.println("Total Deductions: " + totalDeductions);
        System.out.println("Net Pay: " + netPay);

        return netPay;
    }
    
}
