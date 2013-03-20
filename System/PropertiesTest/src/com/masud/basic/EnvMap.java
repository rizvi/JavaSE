/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masud.basic;

import java.util.Map;

/**
 *
 * @author Masudul Haque
 */
public class EnvMap {
    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        
//Load all system variables
//        for (String envName : env.keySet()) {
//            System.out.format("%s=%s%n", envName, env.get(envName));
//        }
      //Get single variables
        System.out.println(env.get("JAVA_HOME"));
        
        System.out.println(env.size());
    }
}

