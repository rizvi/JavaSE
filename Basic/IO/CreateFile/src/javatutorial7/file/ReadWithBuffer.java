/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial7.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Masudul Haque
 */
public class ReadWithBuffer {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        System.out.println(input);
    }
}
