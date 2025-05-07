package com.pluralsight;

import java.time.LocalDateTime;

//Used to store and calculate payroll info about an employee.
public class Employee {

    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;
    private double punchOutTime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked, double punchInTime, double punchOutTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime = punchInTime;
        this.punchOutTime = punchOutTime;
    }

    public Employee() {
        this.employeeId = "";
        this.name = "";
        this.department = "";
        this.payRate = 0;
        this.hoursWorked = 0.0;
        this.punchInTime = 0.0;
        this.punchOutTime = 0.0;
    }

    public double getPunchInTime() {
        return punchInTime;
    }

    public void setPunchInTime(double punchInTime) {
        this.punchInTime = punchInTime;
    }

    public double getPunchOutTime() {
        return punchOutTime;
    }

    public void setPunchOutTime(double punchOutTime) {
        this.punchOutTime = punchOutTime;
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
        setPunchInTime(time);
    }

    public void punchOut(double time) {
        setPunchOutTime(time);
    }

    //Overloaded Methods

    public void punchIn(LocalDateTime time) {
        this.punchInTime = Double.parseDouble(String.valueOf(time));
    }

    public void punchOut(LocalDateTime time) {
        this.punchOutTime = Double.parseDouble(String.valueOf(time));
    }

}
