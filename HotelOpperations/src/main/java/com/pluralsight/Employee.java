package com.pluralsight;

import java.util.Scanner;

//Used to store and calculate payroll info about an employee.
public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private double punchInTime;
    private double punchOutTime;
    private boolean working = false;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }else {
            return hoursWorked;
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHours() * payRate * 1.5;
        return regularPay + overTimePay;
    }

    //Methods

    public void punchIn(double time) {

        if (!working) {
            punchInTime = time;
            working = true;
            System.out.println("Your punch-in time is: " + time);
        }else {
            System.out.println("You are already punched-in.");
        }

    }

    public void punchOut(double time) {

        if (working) {
            punchOutTime = time;
            working = false;
            double currentShiftHours = punchOutTime - punchInTime;
            hoursWorked += currentShiftHours;

            System.out.println("Your punch-out time is: " + time);
            System.out.println("You worked " + currentShiftHours + " hours this shift.");
            System.out.println("Your total hours worked are: " + hoursWorked);

        }else {
            System.out.println("You are already punched-out.");
        }
    }

}
