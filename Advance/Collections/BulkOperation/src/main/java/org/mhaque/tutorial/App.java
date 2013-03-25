package org.mhaque.tutorial;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String[] aValue = {"a", "b", "1", "2", "3"};
        String[] bValue = {"c", "b", "1", "2", "4"};
        Set<String> aSet = new HashSet<>();
        aSet.addAll(Arrays.asList(aValue));
        Set<String> bSet = new HashSet<>();
        bSet.addAll(Arrays.asList(aValue));

        Set<String> union = new HashSet<>(aSet);
        //union.addAll(bSet);

        Set<String> intersection = new HashSet<>(Arrays.asList(aValue));
        intersection.addAll(Arrays.asList(bValue));

        Set<String> difference = new HashSet<>(aSet);
        //difference.removeAll(bSet);
        
//        System.out.println(union);
        System.out.println(intersection);
        System.out.println(difference);

    }
}
