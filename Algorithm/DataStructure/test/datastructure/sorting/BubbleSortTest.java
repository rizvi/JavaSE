/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.sorting;

import java.util.Arrays;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Masudul Haque
 */
public class BubbleSortTest {
    private int[] numbers;
    private final static int SIZE = 7;
    private final static int MAX = 20;

    @Before
    public void setUp() {
               numbers = new int[SIZE];
        Random generator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(MAX);
        }
//        numbers[numbers.length-1]=(int)Long.MAX_VALUE;
    }
    @Test
    public void testNull(){
        BubbleSort bs=new BubbleSort();
        bs.sort(null);
    }
    /**
     * Test of sort method, of class BubbleSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        BubbleSort instance = new BubbleSort();
        instance.sort(numbers);
//        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.print("  "+i);
        }
        System.out.println("");
        if (!validate(numbers)) {
            fail("Should not happen");
        }
        assertTrue(true);
    }
    
    private boolean validate(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                return false;
            }
        }
        return true;
    }
}