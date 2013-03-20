/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.basic;

/**
 *
 * @author Masudul Haque
 */
public enum PayrollDay {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,
            SATURDAY, SUNDAY;
    private static final int HOURS_PER_SHIFT = 8;
    double pay(double hoursWorked, double payRate) {
        double basePay = hoursWorked * payRate;
        double overtimePay; // Calculate overtime pay
        switch(this) {
            case SATURDAY: case SUNDAY:
            overtimePay = hoursWorked * payRate / 2;
            default: // Weekdays
            overtimePay = hoursWorked <= HOURS_PER_SHIFT ?
            0 : (hoursWorked - HOURS_PER_SHIFT) * payRate / 2;
            break;
        }
    return basePay + overtimePay;
    }   
}
