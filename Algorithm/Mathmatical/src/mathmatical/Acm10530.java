/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathmatical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Masudul Haque
 */
public class Acm10530 {

    static List<Integer> numList = new ArrayList<Integer>();
    static List<String> resList = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int num = Integer.parseInt(buff.readLine());
            if (num == 0) {
                break;
            }
            String response = buff.readLine();
            if ("right on".equals(response)) {
                int rightNum = num;
                boolean status = check(rightNum, numList, resList);
                if (status) {
                    System.out.println("Stan may be honest");
                } else {
                    System.out.println("Stan is dishonest");
                }
                numList.clear();
                resList.clear();
                continue;
            }
            numList.add(num);
            resList.add(response);
        }

    }

    private static boolean check(int rightNum, List<Integer> numList, List<String> resList) {
        for (int i = 0; i < resList.size(); i++) {
            if(resList.get(i).equals("too low") && rightNum <= numList.get(i).intValue()){
                return false;
            }
           else if(resList.get(i).equals("too high") && rightNum >= numList.get(i).intValue()){
                return false;
            }
        }
        return true;
    }
}
