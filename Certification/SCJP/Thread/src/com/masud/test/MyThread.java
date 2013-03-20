/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masud.test;

/**
 *
 * @author Masudul Haque
 */
public class MyThread extends Thread {

    public static void main(String[] args) {
       MyThread t = new MyThread();
//        t.start();
//        System.out.print("one. ");
//        t.start();
//        System.out.print("two. ");
//        MyThread t = new MyThread () ;
         Thread x = new Thread(t);
        x.start();

    }

    public void run() {
//        System.out.print("Thread ");
         for(int i=0;i<3;++i) {
           System.out.print(i + "..");
        }
  }
}
