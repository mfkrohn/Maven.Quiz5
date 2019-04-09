package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<SomeType> implements GroupInterface<SomeType>,Iterable<SomeType>{

    protected List<SomeType> group;

    public Group() {
        group = new ArrayList<>();
    }

    public Integer count() {
        return group.size();
    }

    public void insert(SomeType value) {group.add(value);
    }

    public Boolean has(SomeType value) {
        return group.contains(value);
    }

    public SomeType fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }

    public void delete(SomeType value) {group.remove(value);
    }

    public void clear() {group.clear();
    }

    public Iterator<SomeType> iterator() {
        return group.iterator();
    }

    @Override
    public String toString() {
        return group.toString();
    }
}
