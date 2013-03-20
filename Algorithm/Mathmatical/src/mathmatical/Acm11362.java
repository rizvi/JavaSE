/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class Acm11362 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while (testCase-- > 0) {
            int phList = sc.nextInt();
            String numList[] = new String[phList];
            for (int i = 0; i < phList; i++) {
                numList[i]=sc.next();
            }
            Arrays.sort(numList);
            boolean status=true;
            for (int i = 0; i < phList-1; i++) {
                if(numList[i+1].startsWith(numList[i])){
                    status=false;
                    break;
                }
            }
            if(status){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
           
        }
    }
}
