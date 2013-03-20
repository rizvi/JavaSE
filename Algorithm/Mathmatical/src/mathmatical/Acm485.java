/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.math.BigInteger;

/**
 *
 * @author Masudul Haque
 */
public class Acm485 {

    static BigInteger max = new BigInteger("10").pow(60);
    static BigInteger[][] map = new BigInteger[500][500];

    public static void main(String[] args) {
        StringBuilder output=new StringBuilder("");
        StringBuilder temp;
        boolean isBreak = false;
        for (int i = 0;; i++) {
            temp= new StringBuilder("");
            for (int j = 0; j <= i; j++) {
                BigInteger cur = getComb(i, j);
                temp.append(cur).append(" ");
                if (cur.compareTo(max) >= 0) {
                    isBreak = true;
                }
            }
            output.append(temp.substring(0, temp.length()-1)).append("\n");
            if (isBreak) {
                break;
            }
        }
        System.out.print(output);
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
