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
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Acm10673 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(
				System.in));
		int T = Integer.parseInt(buff.readLine());
		StringTokenizer st;
		while (T-- > 0) {
			st = new StringTokenizer(buff.readLine());
			int X = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			long[] ans = exgcd(X / K, (long) Math.ceil((1.0 * X) / K));
			// ans[1] = X ans[2] = Y ans[0] = gcd()
			long a = ans[1], b = ans[2], gcd = ans[0];
			a *= (X / gcd);
			b *= (X / gcd);

			System.out.println(a + " " + b);
		}
	}

	public static long[] exgcd(long a, long b) {
		if (b == 0)
			return new long[] { a, 1, 0 };
		long[] tmp = exgcd(b, a % b);
		return new long[] { tmp[0], tmp[2], tmp[1] - (a / b) * tmp[2] };
	}
}




