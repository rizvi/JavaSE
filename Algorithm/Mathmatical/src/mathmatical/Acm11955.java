/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author Masudul Haque
 */
public class Acm11955 {

    static BigInteger[][] map = new BigInteger[1000][1000];

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder("");
        StringBuilder temp;
        int nCase = Integer.parseInt(buff.readLine());
        for (int n = 1; n <= nCase; n++) {
            String in = buff.readLine();
            int plus = in.indexOf('+');
            String first = in.substring(1, plus);
            String second = in.substring(plus + 1, in.indexOf(')'));
            int exp = Integer.parseInt(in.substring(in.indexOf('^') + 1, in.length()));
            temp = new StringBuilder("");
            int increase = 0;
            int decrease = exp;
            for (int i = 0; i <= exp; i++) {
                BigInteger comb = getComb(exp, i);
                if (!comb.equals(BigInteger.ONE)) {
                    temp.append(comb + "*");
                }

                if (decrease == 1) {
                    temp.append(first + "*");
                } else if (decrease != 0) {
                    temp.append(first + "^" + decrease + "*");
                } else if (!comb.equals(BigInteger.ONE)) {
                    temp = temp.deleteCharAt(temp.length() - 1);
                }

                if (increase == 1) {
                    temp.append(second);
                } else if (increase != 0) {
                    temp.append(second + "^" + increase);
                } else {
                    temp = temp.deleteCharAt(temp.length() - 1);
                }

                increase++;
                decrease--;
                temp.append("+");
            }
            ans.append("Case " + n + ": "
                    + temp.substring(0, temp.length() - 1) + "\n");

        }
        System.out.print(ans);
    }

    private static BigInteger getComb(int i, int j) {

        if (j == 0 || i == j) {
            return BigInteger.ONE;
        }

        if (map[i][j] != null) {
            return map[i][j];
        }

        BigInteger second = getComb(i - 1, j);
        map[i - 1][j] = second;

        BigInteger first = getComb(i - 1, j - 1);
        map[i - 1][j - 1] = first;

        return first.add(second);
    }
}
