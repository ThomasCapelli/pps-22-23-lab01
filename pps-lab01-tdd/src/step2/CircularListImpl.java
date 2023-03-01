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
    public Iterator<Integer> forwardIterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return !list.isEmpty();
            }

            @Override
            public Integer next() {
                if (position >= (list.size() - 1)) {
                    position = 0;
                }
                return list.get(position);
            }
        };
    }

    @Override
    public Iterator<Integer> backwardIterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Integer next() {
                if (position <= 0) {
                    position = list.size() - 1;
                }
                return list.get(position);
            }
        };
    }
}
