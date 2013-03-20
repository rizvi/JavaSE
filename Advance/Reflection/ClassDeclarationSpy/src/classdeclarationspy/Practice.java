/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classdeclarationspy;

/**
 *
 * @author Masudul Haque
 */
public class Practice {

    public static void main(String[] args) {
        //   Boolean b= false;
        //     Class c= b.getClass();
        Class<?> but = javax.swing.JButton.class.getSuperclass();
        for (Class c : but.getDeclaredClasses()) {
            System.out.println(c.getSimpleName());
        }
    }
}
