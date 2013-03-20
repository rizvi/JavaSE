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
public class P494 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int i, cont, pos;
		char c;
		String p;
		while ((line = in.readLine()) != null)
		{
			cont = 0;
			pos = 0;
			for (i=0; i<line.length();i++)
			{
				c = line.charAt(i);
				if(!((c >= 97 && c<= 122) || (c >= 65 && c<= 90))){
					 p = line.substring(pos, i);
					 if (p != null && !p.equals("")){
						 cont++;
					 }
					 pos = i +1;
				} 
			}
			if (pos < line.length())
				cont++;
			System.out.println(cont);
		}
	}
}