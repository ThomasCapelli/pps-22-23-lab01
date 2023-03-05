package step2;

import java.util.Iterator;
import java.util.Optional;

public interface CircularList {
    void add(int i);

    int size();

    boolean isEmpty();

    Iterator<Optional<Integer>> forwardIterator();

    Iterator<Optional<Integer>> backwardIterator();
}
