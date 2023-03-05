package step3;

import java.util.Optional;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

public interface CircularList {
    boolean isEmpty();

    void add(int i);

    int size();

    Optional<Integer> filteredNext(Predicate<Integer> predicate);
}
