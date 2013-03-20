/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TryResource;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Masudul Haque
 */
public class TryWithResource {

    public static void main(String[] args) {
//        try (PrintWriter pw = new PrintWriter(new File("test.txt"))) {
//            pw.write("My Bengal of Gold, I love you.....");
//        } catch (IOException ioex) {
//        }
        PrintWriter pw=null;
        try{
            pw=new PrintWriter(new File("myFile.txt"));
            pw.write("Hi, This is without try-with-resource.");
        }
        catch(IOException ioex){
            
        }
        finally{
            if(pw!=null){
                pw.close();
            }
        }
    }
}
