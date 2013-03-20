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
public class Acm455 {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Scanner sc = new Scanner(System.in);
		int nCases = sc.nextInt();
		for (int i = 0; i < nCases; i++) {
			String in = sc.next();
			int len = 1;
			if (i != 0)
				System.out.println();
			for (int j = 1; j < in.length(); j++) {
				while (in.charAt(j) != in.charAt(j % len)) {
					len++;
				}
			}
			if (in.length() % len == 0)
				System.out.println(len);
			else
				System.out.println(in.length());
		}
	}
}
