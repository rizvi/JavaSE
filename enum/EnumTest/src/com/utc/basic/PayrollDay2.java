/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.basic;

/**
 *
 * @author Masudul Haque
 */
public enum PayrollDay2 {    
    MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
    
    private final PayType payType;
    PayrollDay2(PayType payType) { 
        this.payType = payType; 
    }
    double pay(double hoursWorked, double payRate) {
        return payType.pay(hoursWorked, payRate);
    }
    // The strategy enum type
    private enum PayType {
    WEEKDAY {
    double overtimePay(double hours, double payRate) {
        return hours <= HOURS_PER_SHIFT ? 0 :
        (hours - HOURS_PER_SHIFT) * payRate / 2;
        }
      },
    WEEKEND {
        double overtimePay(double hours, double payRate) {
        return hours * payRate / 2;
        }
     };
    private static final int HOURS_PER_SHIFT = 8;
    abstract double overtimePay(double hrs, double payRate);
    
    double pay(double hoursWorked, double payRate) {
        double basePay = hoursWorked * payRate;
        return basePay + overtimePay(hoursWorked, payRate);
        }
    }
}
