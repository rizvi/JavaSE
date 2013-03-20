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
public class Acm11576 {
    static int ans=0;
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            int charNum = sc.nextInt();
            int wordNum = sc.nextInt();
            String[] wordArr=new String[wordNum];
            for (int i = 0; i < wordNum; i++) {
                wordArr[i]= sc.next();                
            }
            ans=charNum*wordNum;
            for (int i = 0; i < wordNum-1; i++) {                
                 concat(wordArr[i],wordArr[i+1]);   
            }
            System.out.println(ans);
           
        }
    }

    private static void concat(String s1, String s2) {
        String temp="";
        for (int i = 0; i < s1.length(); i++) {
            temp=s1.substring(i, s1.length());
            if(isPrefix(temp, s2)){
                ans=ans- temp.length();
            }
        }
    }
    
	private static boolean isPrefix(String temp, String s2) {
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) != s2.charAt(i))
				return false;
		}
		return true;
	}
    
}
