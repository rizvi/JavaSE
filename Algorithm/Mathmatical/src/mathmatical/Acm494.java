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
public class Acm494 {

    public static void main(String[] args) throws IOException {

        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            int count = 0;
            String word[] = line.split(" ");
            for (String str : word) {
                Character first = str.charAt(0);
                if (first.isLetter(first)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
