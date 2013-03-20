/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masud.test;

/**
 *
 * @author Masudul Haque
 */
public class WaitTest {
      public static void main(String [] args) {
         System.out.print("1 ") ;
         synchronized(args) {
            System.out.print("2 " ) ;
            try {
               args.wait();
              // args.wait(5000);
            }
            catch(InterruptedException e){}
        }
        System.out.print("3 ");
     }
  }
