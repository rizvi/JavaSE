/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utc.effectivejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Masudul Haque
 */
public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = -3; i < 3; i++) {
            set.add(i);
        list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            //list.remove(i);
          //  list.remove((Integer)i);
            list.remove(Integer.valueOf(i));
        }
        System.out.println(set + " " + list);
    }
}
