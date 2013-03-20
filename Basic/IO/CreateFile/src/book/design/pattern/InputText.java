/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package book.design.pattern;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Masudul Haque
 */
public class InputText {
    public static void main(String[] args) throws IOException{
        LowerCaseInputStream buff= new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(new File("text.txt"))));
        int c;
        while((c=buff.read())>= 0){
            System.out.print((char)c);
        }
        buff.close();
        System.out.println();
    }
}
