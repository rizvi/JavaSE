/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.basic;

/**
 *
 * @author Masudul Haque
 */
public class OperationTest {
    public static void main(String[] args) {
        
    
    double x=50;
    double y=25;
    for(Operation op: Operation.values()){
      System.out.printf("Operation %s %f \n",op,op.apply(x, y));     
    }
   }
}
