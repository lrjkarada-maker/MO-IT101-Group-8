/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

/*
 Program: ComputeSemiMonthlySalary
 Description:
 This program computes the semi-monthly salary of MotorPH employees
 based on their total hours worked and hourly rate.

 Plan:
 1. Store employee data in arrays.
 2. Loop through each employee.
 3. Validate payroll inputs.
 4. Compute semi-monthly salary.
 5. Display payroll report.
*/

public class ComputeSemiMonthlySalary {

    public static void main(String[] args) {

        // Total hours worked for the payroll cutoff
        double hoursWorked = 80; // Example hours worked

        // Employee IDs
        int[] employeeID = {
            10001,10002,10003,10004,10005,10006,10007,10008,10009,10010,
            10011,10012,10013,10014,10015,10016,10017,10018,10019,10020,
            10021,10022,10023,10024,10025,10026,10027,10028,10029,10030,
            10031,10032,10033,10034
        };

        // Employee Names
        String[] employeeName = {
            "Manuel Garcia","Antonio Lim","Bianca Aquino","Isabella Reyes",
            "Eduard Hernandez","Andrea Villanueva","Brad San Jose","Alice Romualdez",
            "Rosie Atienza","Roderick Alvaro","Anthony Salcedo","Josie Lopez",
            "Martha Farala","Leila Martinez","Fredrick Romualdez","Christian Mata",
            "Selena De Leon","Allison San Jose","Cydney Rosario","Mark Bautista",
            "Darlene Lazaro","Kolby Delos Santos","Vella Santos","Tomas Del Rosario",
            "Jacklyn Tolentino","Percival Gutierrez","Garfield Manalaysay",
            "Lizeth Villegas","Carol Ramos","Emelia Maceda","Delia Aguilar",
            "John Rafael Castro","Carlos Ian Martinez","Beatriz Santos"
        };

        // Basic monthly salary
        double[] basicSalary = {
            90000,60000,60000,60000,52670,52670,42975,22500,22500,52670,
            50825,38475,24000,24000,53500,42975,41850,22500,22500,23250,
            23250,24000,22500,22500,24000,24750,24750,24000,22500,22500,
            22500,52670,52670,52670
        };

        // Hourly rates based on payroll table
        double[] hourlyRate = {
            535.71,357.14,357.14,357.14,313.51,313.51,255.80,133.93,133.93,313.51,
            302.53,229.02,142.86,142.86,318.45,255.80,249.11,133.93,133.93,138.39,
            138.39,142.86,133.93,133.93,142.86,147.32,147.32,142.86,133.93,133.93,
            133.93,313.51,313.51,313.51
        };

        System.out.println("============= MotorPH Payroll Report =============");

        // Loop through all employees
        for (int i = 0; i < employeeID.length; i++) {

            // Validate inputs
            if (hoursWorked <= 0 || hourlyRate[i] <= 0) {

                System.out.println("Invalid payroll data for Employee ID: " + employeeID[i]);

            } else {

                // Compute semi-monthly salary
                double semiMonthlySalary = hoursWorked * hourlyRate[i];

                // Display employee payroll info
                System.out.println("-------------------------------------------");
                System.out.println("Employee ID: " + employeeID[i]);
                System.out.println("Employee Name: " + employeeName[i]);
                System.out.println("Monthly Salary: PHP " + basicSalary[i]);
                System.out.println("Hourly Rate: PHP " + hourlyRate[i]);
                System.out.println("Hours Worked: " + hoursWorked);
                System.out.println("Semi-Monthly Salary: PHP " + semiMonthlySalary);
            }
        }

        System.out.println("-------------------------------------------");
        System.out.println("Payroll computation completed successfully!");
    }
}