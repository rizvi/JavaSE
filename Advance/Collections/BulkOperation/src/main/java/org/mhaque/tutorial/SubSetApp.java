/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mhaque.tutorial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Masudul Haque
 */
public class SubSetApp {
    public static void main(String[] args) {
        
        String[] bValue = {"c", "b", "1", "2", "4"};        
        Set<String> aSet = new TreeSet<>();
        aSet.addAll(Arrays.asList(bValue));
        SortedSet<String> sSet=(SortedSet<String>) aSet;
        System.out.println(sSet.headSet("4"));
        System.out.println(sSet.tailSet("4"));
    }
}
