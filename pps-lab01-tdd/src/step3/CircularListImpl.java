package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CircularListImpl implements CircularList {

    private final List<Integer> circularList = new ArrayList<>();
    @Override
    public boolean isEmpty() {
        return circularList.isEmpty();
    }

    @Override
    public void add(int i) {
        this.circularList.add(i);
    }

    @Override
    public int size() {
        return this.circularList.size();
    }

    @Override
    public Optional<Integer> filteredNext(Predicate predicate) {
        return circularList.stream().filter(predicate).findFirst();
    }


}
