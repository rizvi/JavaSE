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
public class Acm10300 {
    	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long T = in.nextLong();
		while (T-- != 0) {
			long total = 0, F = in.nextLong();
			while (F-- != 0) {
				long size = in.nextLong(), number = in.nextLong(), envir = in.nextLong();
				total += size * envir;
			number--;
			}
			System.out.println(total);
		}
	}
}
