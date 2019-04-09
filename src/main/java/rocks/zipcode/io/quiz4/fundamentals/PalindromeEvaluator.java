package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> palindromList = new LinkedHashSet<String>() {
        };
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                if(isPalindrome(string.substring(i,j))){
                    palindromList.add(string.substring(i,j));
                }
            }
        }
        return palindromList.toArray(new String[0]);
    }

    public static Boolean isPalindrome(String string) {

        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }

}
