
import java.io.FileInputStream;
import java.util.Properties;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Masudul Haque
 */
public class PropertiesTest {
 public static void main(String[] args) throws Exception {
        // set up new properties object
	// from file "myProperties.txt"
        FileInputStream propFile = new FileInputStream(
                                           "myProperties.txt");
        Properties p = new Properties(System.getProperties());
        p.load(propFile);
        propFile.close();
        // set the system properties
        System.setProperties(p);
	// display new properties
        System.getProperties().list(System.out);
    }
   
}
