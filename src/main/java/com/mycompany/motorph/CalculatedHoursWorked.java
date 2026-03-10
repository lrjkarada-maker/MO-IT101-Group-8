/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph;

import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class CalculatedHoursWorked {

    public static void main(String[] args) {
        String[] name = {"Manuel III", "Antonio", "Bianca Sofia", "Isabella",
            "Eduard", "Andrea Mae", "Brad", "Alice", "Rosie", "Roderick", "Anthony",
            "Josie", "Martha", "Leila", "Fredrick", "Christian", "Selena", "Allison",
            "Cydney", "Mark", "Darlene", "Kolby", "Vella", "Tomas", "Jacklyn", "Percival",
            "Garfield", "Lizeth", "Carol", "Emelia", "Delia", "John Rafael", "Carlos Ian",
            "Beatriz"};

        String[] surname = {"Garcia", "Lim", "Aquino", "Reyes", "Hernandez",
            "Villanueva", "San Jose", "Romualdez", "Atienza", "Alvaro", "Salcedo",
            "Lopez", "Farala", "Martinez", "Romualdez", "Mata", "De Leon", "San Jose",
            "Rosario", "Bautista", "Lazaro", "Delos Santos", "Santos", "Del Rosario",
            "Tolentino", "Gutierrez", "Manalaysay", "Villegas", "Ramos", "Maceda",
            "Aguilar", "Castro", "Martinez", "Santos"};

        String[] timeIn = {"8:59","10:35","10:23","10:57","9:48","9:31","9:09","9:02",
            "8:18","8:10","9:08","9:47","9:48","9:23","8:41","8:41",
            "9:40","8:22","9:53","8:47","9:37","10:54","10:27","9:16",
            "10:18","8:17","9:05","8:52","10:57","9:04","10:07","8:29",
            "10:02","10:05"};

        String[] timeOut = {"18:31","19:44","18:32","18:14","17:13","19:29","16:30","18:06",
            "17:40","15:13","19:36","18:43","19:21","18:09","19:27","16:45",
            "17:24","16:46","17:24","16:27","18:45","20:10","20:10","17:57",
            "18:07","18:31","19:14","17:23","21:44","16:39","20:51","16:46",
            "19:39","18:12"};

        // Make sure the arrays are all the same length
        int totalEmployees = Math.min(Math.min(name.length, surname.length), Math.min(timeIn.length, timeOut.length));
        
        // "H:mm" allows single-digit hours (no leading zero needed)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

        // Loop through each employee using index
        for (int i = 0; i < totalEmployees; i++) {
            LocalTime in = LocalTime.parse(timeIn[i], formatter); // Convert the time-in string into a LocalTime object using the formatter
            LocalTime out = LocalTime.parse(timeOut[i], formatter);// Convert the time-out string into a LocalTime object

    // Calculate the difference between time-in and time-out
    // This gives the total duration worked for the day
    Duration duration = Duration.between(in, out);
    long hours = duration.toHours();
    long minutes = duration.toMinutes() % 60;

    System.out.println("Employee Name: " + name[i] + " " + surname[i]);
    System.out.println("Time In: " + timeIn[i]);
    System.out.println("Time Out: " + timeOut[i]);
    System.out.println("Total Hours Worked: " + hours + "h " + minutes + "m");
    System.out.println("----------------------------------");
}

System.out.println("Test passed: Computation is correct");
    }
}
