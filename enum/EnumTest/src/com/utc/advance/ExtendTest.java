/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.advance;

import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author Masudul Haque
 */
public class ExtendTest {
//    public static void main(String[] args) {
//        double x = 60;//Double.parseDouble(args[0]);
//        double y = 30;//Double.parseDouble(args[1]);
//        test(BasicOperation.class, x, y);
//    }
//    private static <T extends Enum<T> & Operation> void test(
//        Class<T> opSet, double x, double y) {
//        for (Operation op : opSet.getEnumConstants()){
//            System.out.printf("%f %s %f = %f%n",     x, op, y, op.apply(x, y));
//        }
//   }
    
    
    public static void main(String[] args) {
        double x = 60;//Double.parseDouble(args[0]);
        double y = 30;//Double.parseDouble(args[1]);
        test(Arrays.asList(BasicOperation.values()), x,y);
    }
    private static  void test(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet){
            System.out.printf("%f %s %f = %f%n",     x, op, y, op.apply(x, y));
        }
   }
    
    
}
