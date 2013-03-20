/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.timezones;

import java.util.TimeZone;

/**
 *
 * @author Masudul Haque
 */
public class TimeZones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String timeZones[]= TimeZone.getAvailableIDs();
        System.out.println("All available time zones");
        System.out.println("--------------------------------");
        for (String string : timeZones) {
            System.out.println(string);
        }
    }
}
