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
public class Main {

    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) {
            String REGEX_WHITESPACE = "\\s+";
            String cleanLine = line.trim().replaceAll(REGEX_WHITESPACE, " ");
            String[] tokens = cleanLine.split(REGEX_WHITESPACE);
            if (tokens.length == 2) {
                long a = new Long(tokens[0]).longValue();
                long b = new Long(tokens[1]).longValue();
                System.out.println(2 * a * b);
            }
        }
    }
}
