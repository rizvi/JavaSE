/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Masudul Haque
 */
public class MyThread extends Thread{
    public void run(){
        System.out.println("Running......");
        
    }
    public static void main(String[] args) {
       MyThread th= new MyThread();
       th.start();
       th.start();
    }
}
