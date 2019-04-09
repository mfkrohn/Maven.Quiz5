package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class  ComparableTreeSet<T extends Comparable> extends TreeSet<T> implements Comparable<ComparableTreeSet<T>> {
    public ComparableTreeSet(T... arr) {
        super(Arrays.asList(arr));
    }

    public ComparableTreeSet(List<T> list){
        super(list);
    }

    public ComparableTreeSet() {
        super(new ArrayList<T>());
    }

    public int compareTo(ComparableTreeSet<T> o) {
        if(this.size()!=o.size()){

            return this.first().compareTo(o.first());

        }else
            return this.size()-o.size();
    }


    @Override
    public String toString(){
        return super.toString();
    }


}
