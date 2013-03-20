/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Masudul Haque
 */
public class Acm10680 {

    static int[] primeFactor;
    static long[] lcms;
    static long[] counts;
    static double res = 1;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(
                System.in));
        int maxValue = 1000001;
        primefactors(maxValue);
        counts = new long[maxValue];
        lcms = new long[maxValue];
        Arrays.fill(lcms, 1L);
        for (int i = 2; i < 1000001; i++) {
            factorize(i);
        }

        StringBuilder out = new StringBuilder("");
        while (true) {
            int n = Integer.parseInt(buff.readLine());
            if (n == 0) {
                break;
            }

            out.append(lcms[n] % 10 + "\n");
        }
        System.out.print(out);
    }

    private static void primefactors(int MAXN) {
        primeFactor = new int[MAXN];
        primeFactor[0] = primeFactor[1] = -1;
        for (int i = 2; i * i < MAXN; i++) {
            if (primeFactor[i] == 0) {
                for (int j = i * i; j < MAXN; j += i) {
                    primeFactor[j] = i;
                }
            }
        }
        for (int i = 2; i < MAXN; i++) {
            if (primeFactor[i] == 0) {
                primeFactor[i] = i;
            }
        }

    }

    private static void factorize(int n) {
        int tempN = n;
        lcms[tempN] = lcms[tempN - 1];
        while (primeFactor[n] != -1) {
            long exp = (long) (Math.log(tempN) / Math.log(primeFactor[n]));
            if (exp > counts[primeFactor[n]]) {
                lcms[tempN] *= (long) Math.pow(primeFactor[n], exp
                        - counts[primeFactor[n]]);
                counts[primeFactor[n]] = exp;
            }
            n /= primeFactor[n];
        }
        while (lcms[tempN] % 10 == 0) {
            lcms[tempN] /= 10;
        }
        lcms[tempN] %= 100000000;// modulo 10^8 to reduce saved value
    }
}
