/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.sorting;

import java.util.Arrays;

/**
 *
 * @author Masudul Haque
 */
public class BubbleSort {
      private int[] numbers;
    public void sort(int[] values) {
        if(values==null){
            return;
        }
//        this.numbers=values;
//        Arrays.sort(numbers);
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if(values[i]<values[j]){
                    int t=values[i];
                    values[i]=values[j];
                    values[j]=t;
//                    exchange(values[i], values[j]);
                }
            }
            System.out.println(values[i]);
//            numbers[i]=values[i];
        }
//        this.numbers=values;
    }

    private void exchange(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

   
}
