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
public class Acm11780 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int input=sc.nextInt();
            if(input==0){
                break;
            }
            int mod=input%5;
            switch(mod){
                case 0:
                    System.out.println("0.00");
                    break;
                case 1:
                case 4:
                    System.out.println("0.40");
                    break;
                case 2:
                case 3:
                    System.out.println("0.20");
                    break;
            }
        }
    }
}
