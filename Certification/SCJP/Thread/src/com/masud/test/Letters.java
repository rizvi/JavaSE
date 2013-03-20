/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masud.test;

/**
 *
 * @author Masudul Haque
 */
public class Letters extends java.lang.Thread {
    private String name;
    public Letters(String name) {
        this.name = name;
    }
    public void write () {
       System.out.print(name);
       System.out.print(name);
    }
    
    public void run(){
        synchronized(Letters.this){
    write();
        }
    }
    public static void main(String[] args) {
       new Letters("X").start();
        new Letters("Y").start();
        //Thread
    }
}
