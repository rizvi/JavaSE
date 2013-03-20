/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructordemo;

/**
 *
 * @author Masudul Haque
 */
public class ConstructorDemo {
    public void ConstructorDemo() {
//        this("");
        System.out.println("No arg");
       
    }

    public ConstructorDemo(String arg1) {
        this("","");
        System.out.println("One arg");        
    }

    public ConstructorDemo(String arg1, String args2) {
        System.out.println("Two arg");
    }

    public static void main(String[] args) {
        new ConstructorDemo("");
    }
}
