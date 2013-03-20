/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.basic;

/**
 *
 * @author Masudul Haque
 */
public class WeightTable {
    public static void main(String[] args) {
        double earthWeight = 66;//Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()){
            System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}
