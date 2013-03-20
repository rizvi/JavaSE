/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scjp.studyguide6;

/**
 *
 * @author Masudul Haque
 */
public class Beverage {

    private void drink() {
        System.out.println("Beverage");
    }

    public static void main(String[] args) {
       // Beverage b= new Coffee();
        //b.drink();
    //    String x= 12-6+"hello"+7+5;
     //   System.out.println(x);
     //   System.out.println(12 % 3.2);
        byte a=50,b=40;
        byte sum=(byte)(a+b);
    }
}
 class Coffee extends Beverage {
 public void drink() {
 System.out.println("Coffee");
 }
 }
