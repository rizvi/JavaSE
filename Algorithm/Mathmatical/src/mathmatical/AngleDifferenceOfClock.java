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
class AngleDifferenceOfClock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{

        Scanner s = new Scanner(System.in);
//        Scanner s2 = new Scanner(System.in);
        while (s.hasNextInt()) {
            System.out.println(2 * s.nextInt() * s.nextInt());
        }
    }
}
