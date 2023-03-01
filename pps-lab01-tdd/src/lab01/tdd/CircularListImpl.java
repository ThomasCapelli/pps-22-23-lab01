package lab01.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList{

    private List<Integer> list = new ArrayList<>();
    private int currentPosition = -1;
    @Override
    public void add(int element) {
        list.add(element);
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
    public Optional<Integer> next() {
        if(list.size() == 0) {
            return Optional.empty();
        } else if (currentPosition >= list.size() - 1) {
            currentPosition = -1;
        }
        this.currentPosition = currentPosition + 1;
        return Optional.of(list.get(currentPosition));
    }

    @Override
    public Optional<Integer> previous() {
        if(list.size() == 0) {
            return Optional.empty();
        } else if (currentPosition <= 0) {
            currentPosition = list.size();
        }
        this.currentPosition = currentPosition - 1;
        return Optional.of(list.get(currentPosition));
    }

    @Override
    public void reset() {
        this.currentPosition = -1;
    }
}
