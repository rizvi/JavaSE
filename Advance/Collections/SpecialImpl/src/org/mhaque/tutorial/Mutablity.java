/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mhaque.tutorial;

/**
 *
 * @author Masudul Haque
 */
public class Mutablity {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Init");
        String str2=new String("first");
        changeIt(str);
        
        System.out.println(str);
        System.out.println(changeIt(str2));
    }

    private static String changeIt(String str) {
     return str+=" after change";
    }

    private static void changeIt(StringBuilder str) {
        str.append(" after change");
    }
}
