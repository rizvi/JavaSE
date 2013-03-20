/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masud.test;

/**
 *
 * @author Masudul Haque
 */
public class SyncTest {
    public  static  void main(String[] args) throws InterruptedException {
        Thread t= new Thread();
        System.out.println("One");
        t.start();
        System.out.println("Two");
        synchronized(t){
        t.wait(1000);
        }
        System.out.println("Three");
    }
}
