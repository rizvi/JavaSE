/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package garbasecollect;

import java.math.BigDecimal;

/**
 *
 * @author Masudul Haque
 */
public class CompareTest {
    public static void main(String[] args) {
        BigDecimal a=new BigDecimal("1.0");
        BigDecimal b=new BigDecimal("1.00");
        
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        
    }
}
