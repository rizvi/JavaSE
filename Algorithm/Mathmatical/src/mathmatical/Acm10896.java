/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

/**
 *
 * @author Masudul Haque
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Acm10896 {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		int nCases = Integer.parseInt(buff.readLine());
		StringBuilder out = new StringBuilder("");

		for (int i = 0; i < nCases; i++) {
			String input = buff.readLine();
			String word = buff.readLine();
			String[] array = input.split(" ");
			PriorityQueue<Character> pq = new PriorityQueue<Character>();

			for (int j = 0; j < array.length; j++) {
				if (array[j].length() == word.length() && word.length() != 0) {
					int shift = (array[j].charAt(0) - word.charAt(0) + 26) % 26;
					boolean status = false;
					for (int k = 1; !status && k < word.length(); k++)
						if ((array[j].charAt(k) - word.charAt(k) + 26) % 26 != shift)
							status = true;

					if (!status)
						pq.add((char) ('a' + shift));
				}
			}
			while (!pq.isEmpty())
				out.append(pq.poll());
			out.append("\n");
		}
		System.out.print(out);
	}
}
