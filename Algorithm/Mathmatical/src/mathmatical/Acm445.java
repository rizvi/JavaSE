/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

/**
 *
 * @author Masudul Haque
 */
import java.io.IOException;
import java.io.InputStream;

public class Acm445 {

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        int ch, d = 0;
        char c;
        while ((ch = in.read()) != -1) {
            c = (char) ch;

            if (Character.isDigit(c)) {
                d += c - '0';
            } else {
                if (c == '!' || c == '\n') {
                    System.out.println("");
                } else {
                    while (d-- > 0) {
                        System.out.print(c == 'b' ? ' ' : c);
                    }
                }
                d = 0;
            }

        }
    }
}
