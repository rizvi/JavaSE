/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.effectivejava;

/**
 *
 * @author Masudul Haque
 */
class Wine {
    String name() { return "wine"; }
}
class SparklingWine extends Wine {
     String name() { return "sparkling wine"; }
}
class Champagne extends SparklingWine {
     String name() { return "champagne"; }
}
public class Overriding {
    public static void main(String[] args) {
        Wine[] wines = {
            new Wine(), new SparklingWine(), new Champagne()
        };
        for (Wine wine : wines){
            System.out.println(wine.name());
        }
    }
}
