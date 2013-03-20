/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial7.file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Masudul Haque
 */
public class ReadWithData {
    public static void main(String[] args) throws IOException{
        DataInputStream dataInputStream=new DataInputStream(System.in);
       int first= dataInputStream.readInt();
        System.out.println(first);
    }
}
