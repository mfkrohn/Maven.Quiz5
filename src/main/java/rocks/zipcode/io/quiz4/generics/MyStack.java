package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType>{

    List<SomeType> stack;
    public MyStack() {
        stack = new ArrayList<>();
    }

    public Boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(SomeType i) {
        stack.add(0,i);
    }

    public SomeType peek() {
        if(isEmpty()){
            return null;
        }
        return stack.get(0);
    }

    public SomeType pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }

    @Override
    public Iterator<SomeType> iterator() {
        return stack.iterator();
    }
}
