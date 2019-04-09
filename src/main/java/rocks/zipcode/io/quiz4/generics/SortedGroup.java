package rocks.zipcode.io.quiz4.generics;

import java.util.Comparator;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<SomeType extends Comparable> extends Group<SomeType> {
    public SortedGroup() {
        super();
    }

    @Override
    public void insert(SomeType value) {
        super.insert(value);
        group.sort(Comparator.naturalOrder());
    }

    @Override
    public void delete(SomeType value) {
        super.delete(value);
        group.sort(Comparator.naturalOrder());
    }

    public Integer indexOf(SomeType value) {
        group.sort(Comparator.naturalOrder());
        return group.indexOf(value);
    }
}
