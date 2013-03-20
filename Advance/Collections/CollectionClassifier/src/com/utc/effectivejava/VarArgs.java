/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.effectivejava;

/**
 *
 * @author Masudul Haque
 */
public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3));
    }
    static int sum(int... args){
        int s=0;
        for(int arg:args){
            s+=arg;
        }
        return s;
    }
}


