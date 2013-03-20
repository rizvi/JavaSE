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
import java.util.Scanner;

public class Acm10298 {

    public static void main(String[] args) throws NumberFormatException,
            IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String in = sc.next();
            if (".".equals(in)) {
                break;
            }
            if(in.length()==0){
                System.out.println("0");
                continue;
            }
            int len = 1;
            for (int j = 1; j < in.length(); j++) {
                while (in.charAt(j) != in.charAt(j % len)) {
                    len++;
                }
            }
            if (in.length() % len == 0) {
                System.out.println(in.length()/len);
            } else {
                System.out.println(1);
            }
        }
    }
}
