/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Masudul Haque
 */
public class Acm11888 {

    public static void main(String[] args) throws NumberFormatException,
            IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(
                System.in));
        int nCases = Integer.parseInt(buff.readLine());
        for (int i = 0; i < nCases; i++) {
            String inputStr = buff.readLine();
            if (isAl(inputStr)) {
                System.out.println("alindrome");
            } else if (isPal(inputStr)) {
                System.out.println("palindrome");
            } else {
                System.out.println("simple");
            }
        }
    }

    private static boolean isAl(String inputStr) {
        for (int i = 1; i < inputStr.length(); i++) {
            if (isPal(inputStr.substring(0, i)) && isPal(inputStr.substring(i, inputStr.length()))) {
                return true;
            }
        }
        return false;
    }

    private static boolean isPal(String inputStr) {
        for (int i = 0, j = inputStr.length() - 1; i < j; i++, j--) {
            if (inputStr.charAt(i) != inputStr.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
