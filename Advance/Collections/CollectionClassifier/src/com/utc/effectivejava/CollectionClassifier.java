/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.effectivejava;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Masudul Haque
 */
public class CollectionClassifier {

    /**
     * @param args the command line arguments
     */
    public static String classify(Set<?> s) {
        return "Set";
    }
    
    public static String classify(List<?> lst) {
        return "List";
    }
    public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }
    public static void main(String[] args) {
        Collection<?>[] collections = {
            new HashSet<String>(),
            new ArrayList<BigInteger>(),
            new HashMap<String, String>().values()
        };
        for (Collection<?> c : collections){
            System.out.println(classify(c));
        }
    }
}
