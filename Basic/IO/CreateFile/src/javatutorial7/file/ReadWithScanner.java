/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial7.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Masudul Haque
 */
public class ReadWithScanner {
    public static void main(String[] args) throws IOException{
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        System.out.println(input);
    }
}
