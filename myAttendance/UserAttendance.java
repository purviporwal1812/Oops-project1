package myAttendance;

import java.util.Scanner;

interface Attendance {
    void inputData();

    double calculateAttendancePercentage(int[][] A);
}

public class UserAttendance implements Attendance {
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You can calculate your overall attendance percentage in whole sem (Three months)." +
                "\n" + "For how many months do you want to calculate your attendance percentage..(Enter 1/2/3)");
        int numMonth = scanner.nextInt();
        // attendance matrix includes all working days in a month(4 weeks, 5 days)
        int[][] attendanceMatrix = new int[4][5];

        // Input attendance

        for (int month = 1; month <= numMonth; month++) {
            System.out.println("Enter attendance data for " + month + "st month");
            for (int week = 0; week < 4; week++) {
                for (int day = 0; day < 5; day++) {
                    System.out.println("Did you present on " + (month) + "st month's Week " + (week + 1) + " & Day "
                            + (day + 1) + "? (1 for present, 0 for absent)");
                    attendanceMatrix[week][day] = scanner.nextInt();
                }
            }
            double attendancePercentage = calculateAttendancePercentage(attendanceMatrix);
            System.out.println("Your attendance percentage in this month is: " + attendancePercentage + "%");
        }
    }

    // Calculation of the attendance percentage
    public double calculateAttendancePercentage(int[][] attendanceMatrix) {
        int totalDays = 0;
        int presentDays = 0;

        for (int[] week : attendanceMatrix) {
            for (int day : week) {
                totalDays++;
                if (day == 1) {
                    presentDays++;
                }
            }
        }

        return (double) presentDays / totalDays * 100;
    }
}
