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
public class Acm12149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            int count = 0;
            for (int k = 0; k <= input; k++) {
                for (int i = 0; i < input; i++) {
                    for (int j = 0; j < input; j++) {
                        if(k+i<input && k+j<input){
                            count++;
                        }
                    }

                }

            }
            System.out.println(count);
        }
    }
}
