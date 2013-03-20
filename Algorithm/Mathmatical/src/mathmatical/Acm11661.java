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
public class Acm11661 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            String input = sc.next();
            int r = -1, d = -1, min=Integer.MAX_VALUE;
            for (int i = 0; i < num; i++) {
                char ch=input.charAt(i);
                switch(ch){
                    case '.':
                        continue;
                    case 'R':
                        r=i;
                        if(d!=-1){
                            min= Math.min(min, Math.abs(r-d));
                        }
                        break;
                    case 'D':
                        d=i;
                        if(r!=-1){
                            min= Math.min(min, Math.abs(r-d));
                        }
                        break;
                    default:
                        min=0;
                        break;
                }
            }
            System.out.println(min);
        }
    }
}
