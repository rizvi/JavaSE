/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scjp.studyguide6;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.LocalAttribute;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 *
 * @author Masudul Haque
 */
public class ClassTest {

    /**
     * @param args the command line arguments
     */
    private class Another {
    }

    public static void main(String[] args) {
//        byte a=23, b=4;
//        int x=a%b;
//        System.out.println(x);
//        
//        NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
//        double value=23.457;
//        System.out.println(nf.format(value));

        Pattern p = Pattern.compile(".+es");
        String[] words = {"unless", "guesses", "boxes", "guest"};
        for (String word : words) {
            if (p.matcher(word).matches()) {
                System.out.println(word);
            }
        }
    }
}
