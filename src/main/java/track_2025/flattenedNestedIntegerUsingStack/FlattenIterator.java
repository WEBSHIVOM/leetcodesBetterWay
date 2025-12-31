package main.java.track_2025.flattenedNestedIntegerUsingStack;

import java.util.Iterator;
import java.util.List;

public class FlattenIterator implements Iterator<Integer> {

    private List<Integer> flatList;
    private Iterator<Integer> listIterator;

    public FlattenIterator(List<Object> flat){


    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
}
