/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motorph.payroll.system.testhoursworked;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeHoursCalculator {
    public static void main(String[] args) {
        String[] inputData = {
            "10011 Lopez Josie 05/09/2022 10:30 17:00",
                "10012 DeLeon	Selena 	05/09/2022 8:00	17:00",
                "10021	Manalaysay	Garfield 	05/09/2022	13:00	17:00",
                "10014 Bautista Mark 06/09/2022 8:00 17:00"
        };

        for (String data : inputData) {
            String[] employeeInfo = data.split("\\s+");
            int employeeId = Integer.parseInt(employeeInfo[0]);
            String firstName = employeeInfo[2];
            String lastName = employeeInfo[1];
            String date = employeeInfo[3];
            String timeIn = employeeInfo[4];
            String timeOut = employeeInfo[5];

            double hoursWorked = calculateHoursWorked(timeIn, timeOut);
            double adjustedHours = adjustHours(hoursWorked);

            System.out.println("Employee ID: " + employeeId + ", Name: " + firstName + " " + lastName +
                    ", Date: " + date + ", Hours Worked: " + adjustedHours);
        }
    }

    private static double calculateHoursWorked(String timeIn, String timeOut) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            Date in = format.parse(timeIn);
            Date out = format.parse(timeOut);

            long diff = out.getTime() - in.getTime();
            return diff / (60.0 * 60.0 * 1000); // Convert milliseconds to hours
        } catch (ParseException e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    private static double adjustHours(double hoursWorked) {
        if (hoursWorked >= 5) {
            return hoursWorked - 1.0;
        } else {
            return hoursWorked;
        }
    }
}
