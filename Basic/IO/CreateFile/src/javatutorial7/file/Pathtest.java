/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial7.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Masudul Haque
 */
public class Pathtest {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("D:/mylog.log");
        
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isHidden(path));
        System.out.println(Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS));
        System.out.println(Files.size(path));
        System.out.println(Files.getLastModifiedTime(path, LinkOption.NOFOLLOW_LINKS));
    }
}
