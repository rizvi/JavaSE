/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mhaque.tutorial;

import java.util.EnumSet;

/**
 *
 * @author Masudul Haque
 */
public class SpecialImpl {
    enum Day{
        SAT(1),SUN(2),
        MON(3),TUE(4),
        WED(5),THY(6),
        FRI(7);
        int value;
        private Day(int value) {
            this.value=value;
        }
    };
    public static void main(String[] args) {
        for (Day d : EnumSet.range(Day.MON, Day.MON)) {
            System.out.println(d.value);
        }
        System.out.println(EnumSet.of(Day.SAT,Day.SUN));
        
 
    }
}
