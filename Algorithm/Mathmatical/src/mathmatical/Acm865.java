/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Masudul Haque
 */
public class Acm865 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(buff.readLine());
        buff.readLine();
        StringBuilder output = new StringBuilder();
        HashMap<String,String> map = new HashMap<String,String>();
        for (int n = 0; n < testCase; n++) {
            map.clear();
            String from = buff.readLine();
            String to = buff.readLine();
            if (n != 0) {
                output.append("\n");
            }
            output.append(to + "\n" + from + "\n");
            for (int i = 0; i < from.length(); i++) {
                map.put(""+from.charAt(i), to.charAt(i)+"");
            }
            
            String input="";
            while((input=buff.readLine())!=null && input.length()!=0){
                for(int i=0;i<input.length();i++){
                    if(map.containsKey(""+input.charAt(i))){
                        output.append(map.get(i)+"");
                    }
                    else{
                       output.append(input.charAt(i));   
                    }
                }
                output.append("\n");
            }
            System.out.print(output);
        }
    }
}
