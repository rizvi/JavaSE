/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class Acm412 {

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int total = sc.nextInt();
            if (total == 0) {
                break;
            }
            int values[] = new int[total];
            for (int i = 0; i < total; i++) {
                values[i] = sc.nextInt();
            }
            int counter = 0;
            for (int i = 0; i < total; i++) {
                for (int j = i + 1; j < total; j++) {
                    if (gcd(values[i], values[j]) == 1) {
                        counter++;
                    }
                }
            }

            long numOfPair = total * (total - 1) / 2;
            if (counter == 0) {
                System.out.println("No estimate for this data set.");
            } else {
                double PI = (numOfPair * 6.0) / counter;
                System.out.printf("%.6f\n", Math.sqrt(PI));
            }
        }
    }
}
