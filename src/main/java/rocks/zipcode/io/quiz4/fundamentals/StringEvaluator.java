package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substringSet = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length()+1; j++) {
                substringSet.add(string.substring(i,j));
            }
        }
        return substringSet.toArray(new String[0]);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        return Stream.of(getAllSubstrings(string1)).filter(sub -> Arrays.asList(getAllSubstrings(string2)).contains(sub)).toArray(String[]::new);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        return Stream.of(getCommonSubstrings(string1,string2)).max(Comparator.comparingInt(String::length)).get();
    }
}
