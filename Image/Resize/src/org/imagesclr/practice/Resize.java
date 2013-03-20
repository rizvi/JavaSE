/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.imagesclr.practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import javax.imageio.ImageIO;
import org.imgscalr.Scalr;

/**
 *
 * @author Masudul Haque
 */
public class Resize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        File file= new File("C:/Users/Public/Pictures/Sample Pictures/Penguins.jpg");
        BufferedImage img = ImageIO.read(file);
        BufferedImage scaledImg = Scalr.resize(img, Scalr.Method.QUALITY,200);
        
       ImageIO.write(scaledImg, "jpg", file);
       
    }
}
