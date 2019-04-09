package rocks.zipcode.io.quiz4.generics;

import java.util.*;
import java.util.stream.Collectors;

import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;



/**
 * @author leon on 11/12/2018.
 */
public class GenericUtils {
    public static <SomeType extends Comparable> Iterable<? extends Iterable<SomeType>> powerSet(Set<SomeType> originalSet) {
        Set<Set<SomeType>> powerSet = Sets.powerSet(originalSet);
        List<SomeType> permList = new ArrayList<SomeType>(Collections.powerSet);


        return powerSet;
    }

    public static <SomeType extends Comparable> Iterable<? extends Iterable<SomeType>> powerSet(SomeType... originalSet) {
        return powerSet(new TreeSet<>(Arrays.asList(originalSet)));
    }

    public static <SomeType extends Comparable> Set<Set<SomeType>> getSubSets(Set<SomeType> ogSet){

        return Sets.powerSet(ogSet);
    }
}

