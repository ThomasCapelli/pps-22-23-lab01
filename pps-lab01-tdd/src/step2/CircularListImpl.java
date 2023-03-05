package step2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private final List<Integer> list = new ArrayList<>();
    private int position = 0;
    @Override
    public void add(int i) {
        list.add(i);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Iterator<Optional<Integer>> forwardIterator() {
        return new Iterator<Optional<Integer>>() {
            @Override
            public boolean hasNext() {
                return !list.isEmpty();
            }

            @Override
            public Optional<Integer> next() {
                if (hasNext()){
                    if (position >= (list.size() - 1)) {
                        position = 0;
                    }
                    return Optional.of(list.get(position));
                }
                return Optional.empty();

            }
        };
    }

    @Override
    public Iterator<Optional<Integer>> backwardIterator() {
        return new Iterator<Optional<Integer>>() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Optional<Integer> next() {
                if (hasNext()) {
                    if (position <= 0) {
                        position = list.size() - 1;
                    }
                    return Optional.of(list.get(position));
                }
                return Optional.empty();
            }
        };
    }
}
