/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class Acm11850 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while ((n = sc.nextInt()) != 0) {
            int[] list = new int[n];
            for (int i = 0; i < n; i++) {
                list[i] = sc.nextInt();
            }
            Arrays.sort(list);
            boolean isPossible = true;
            for (int i = 0; i < n - 1; i++) {
                if (list[i + 1] - list[i] > 200) {
                    isPossible = false;
                }
            }
            if (isPossible && (1422-list[n-1])*2 <= 200 ) {
                System.out.println("POSSIBLE");
            } else {
                System.out.println("IMPOSSIBLE");
            }

        }
    }
}
