package step2;

import java.util.Iterator;

public interface CircularList {
    void add(int i);

    int size();

    boolean isEmpty();

    Iterator<Integer> forwardIterator();

    Iterator<Integer> backwardIterator();
}
