/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.masud.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Masudul Haque
 */
public class PropertiesTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties defaultProps = new Properties();
        try (FileInputStream in = new FileInputStream("defaultProperties")) {
            defaultProps.load(in);
        }
        
    }
}
