/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeAttendance {

    public static void main(String[] args) {
        // Replace this sample data with your actual attendance records
        String[][] attendanceData = {
                {"10001", "Crisostomo", "Jose", "01/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "02/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "05/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "06/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "07/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "08/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/09/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/13/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/14/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/15/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/16/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/19/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/20/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/21/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/22/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/23/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/26/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/27/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/28/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/29/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/30/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "03/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "04/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "05/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "06/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "07/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/10/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/13/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/14/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/17/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/18/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/19/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/20/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/21/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/24/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/25/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/26/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/27/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/28/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/31/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "01/11/2022", "0:00", "0:00"},
                {"10001", "Crisostomo", "Jose", "02/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "03/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "04/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "07/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "08/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "09/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "10/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/11/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/14/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/15/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/16/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/17/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/18/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/21/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/22/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/23/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/24/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/25/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/28/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/29/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "11/30/2022", "0:00", "0:00"},
                {"10001", "Crisostomo", "Jose", "01/12/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "02/12/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "05/12/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "06/12/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "07/12/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "08/12/2022", "0:00", "0:00"},
                {"10001", "Crisostomo", "Jose", "09/12/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/12/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/13/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/14/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/15/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/16/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/19/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/20/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/21/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/22/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/23/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/26/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/27/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/28/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/29/2022", "8:00", "17:00"},
                {"10001", "Crisostomo", "Jose", "12/30/2022", "0:00", "0:00"},
                
        };

        // Map to store total hours worked per month for each employee
        Map<String, Double> totalHoursWorkedPerMonth = new HashMap<>();

        // SimpleDateFormat to parse date and time
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        for (String[] record : attendanceData) {
            String employeeId = record[0];
            String date = record[3];
            String startTime = record[4];
            String endTime = record[5];

            // Combine date and time and parse to Date object
            try {
                Date startDateTime = dateFormat.parse(date + " " + startTime);
                Date endDateTime = dateFormat.parse(date + " " + endTime);

                // Calculate the duration in hours
                double duration = (endDateTime.getTime() - startDateTime.getTime()) / (60.0 * 60.0 * 1000.0);

                // Get the month from the date
                SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
                String month = monthFormat.format(startDateTime);

                // Update total hours worked for the employee in that month
                totalHoursWorkedPerMonth.put(employeeId + "_" + month, totalHoursWorkedPerMonth.getOrDefault(employeeId + "_" + month, 0.0) + duration);

            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        // Display the result
        for (Map.Entry<String, Double> entry : totalHoursWorkedPerMonth.entrySet()) {
            String[] keyParts = entry.getKey().split("_");
            String employeeId = keyParts[0];
            String month = keyParts[1];
            double hoursWorked = entry.getValue();
            System.out.println("Employee ID: " + employeeId + ", Month: " + month + ", Hours Worked: " + hoursWorked);
        }
    }
}
                       