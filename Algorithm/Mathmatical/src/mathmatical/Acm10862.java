/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class Acm10862 {
static BigInteger[] list;
	static BigInteger TWO = new BigInteger("2");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fib();
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			System.out.println(list[n * 2 - 1]);
		}
	}

	public static void fib() {
		list = new BigInteger[50001];
		Arrays.fill(list, BigInteger.ONE);
		for (int i = 2; i < 50000; i++)
			list[i] = list[i - 1].add(list[i - 2]);
	}
}
