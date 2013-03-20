/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Masudul Haque
 */
public class Acm11830 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(
                System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(buff.readLine());
            int digit = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            if (digit == 0 && "0".equals(str)) {
                break;
            }
            StringBuilder  out = new StringBuilder("");
            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                if (ch!='0' && (ch- '0' != digit)) {
                    out.append(str.charAt(i));
                }
            }
            if("".equals(out.toString())){
                out.append("0");
            }
            
            System.out.println(out);
        }
    }
}
