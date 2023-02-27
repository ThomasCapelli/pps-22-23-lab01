package step2;

import java.util.ArrayList;
import java.util.List;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new ArrayList<>();
    @Override
    public void add(int i) {
        list.add(i);
    }

    @Override
    public int size() {
        return list.size();
    }
}
