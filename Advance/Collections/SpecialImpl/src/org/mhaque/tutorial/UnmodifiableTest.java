/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mhaque.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Masudul Haque
 */
public class UnmodifiableTest {
    public static void main(String[] args) {
//        List bfor=new ArrayList();
//        bfor.add("abc");
//        List list=new ArrayList();
//        list.add("abc");
//        list.add("another");
//        boolean isDij= Collections.disjoint(list, bfor);
//       
//        list.add("abc");
//        System.out.println(isDij);
        String str="I live in Bangladesh.";
        char[] ch=str.toCharArray();
        List<Character> cs=new ArrayList<>();
        for (Character character : ch) {
            cs.add(character);
        }
        
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            int freq= Collections.frequency(cs, c);
            System.out.println(c+"   "+freq);
        }
    }
}
