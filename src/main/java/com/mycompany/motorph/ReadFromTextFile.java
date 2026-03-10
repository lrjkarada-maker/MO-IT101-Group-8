/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFromTextFile {

    // Example deduction methods from Task 9
    public static double computeSSS(double grossSalary) {
        return grossSalary * 0.045; // Example: 4.5%
    }

    public static double computePhilHealth(double grossSalary) {
        return grossSalary * 0.03; // Example: 3%
    }

    public static double computePagIBIG(double grossSalary) {
        return grossSalary * 0.02; // Example: 2%
    }

    public static double computeIncomeTax(double grossSalary) {
        return grossSalary * 0.10; // Example: 10%
    }

    public static void main(String[] args) {

        // File path (relative to project directory)
        String fileName = "employee_data.txt";

        // Create a File object
        File file = new File(fileName);

        // Check if file exists and is readable
        if (!file.exists()) {
            System.out.println("Error: File " + fileName + " does not exist.");
            return;
        }
        if (!file.canRead()) {
            System.out.println("Error: File " + fileName + " is not readable.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            System.out.println("=== MotorPH Payroll Summary ===\n");

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Skip empty lines
                if (line.trim().isEmpty()) continue;

                // Split line by comma
                String[] parts = line.split(",");
                if (parts.length != 2) {
                    System.out.println("Warning: Invalid record format -> " + line);
                    continue;
                }

                String name = parts[0].trim();
                double grossSalary = 0;

                // Parse gross salary
                try {
                    grossSalary = Double.parseDouble(parts[1].trim());
                    if (grossSalary <= 0) {
                        System.out.println("Warning: Invalid salary for " + name + ". Must be positive.");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Warning: Salary is not a number for " + name + ".");
                    continue;
                }

                // Compute deductions
                double sss = computeSSS(grossSalary);
                double philHealth = computePhilHealth(grossSalary);
                double pagIBIG = computePagIBIG(grossSalary);
                double incomeTax = computeIncomeTax(grossSalary);

                // Compute net pay
                double netPay = grossSalary - (sss + philHealth + pagIBIG + incomeTax);

                // Display payroll summary
                System.out.println("Employee: " + name);
                System.out.printf("Gross Salary: %.2f\n", grossSalary);
                System.out.printf("SSS: %.2f\n", sss);
                System.out.printf("PhilHealth: %.2f\n", philHealth);
                System.out.printf("Pag-IBIG: %.2f\n", pagIBIG);
                System.out.printf("Income Tax: %.2f\n", incomeTax);
                System.out.printf("Net Pay: %.2f\n", netPay);
                System.out.println("-------------------------------");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
