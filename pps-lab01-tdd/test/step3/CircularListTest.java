package step3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CircularListTest {

    private CircularList circularList;
    @BeforeEach
    void setUp() {
        this.circularList = new CircularListImpl();
    }

    @Test
    void testEmptyList() {
        assertTrue(circularList.isEmpty());
    }
    @Test
    void testAddElement() {
        this.fillList();
        assertFalse(circularList.isEmpty());
    }
    @Test
    void testSize() {
        this.fillList();
        assertEquals(3 , circularList.size());
    }

    @Test
    void testFilteredNext() {
        this.fillList();
        assertEquals(Optional.of(100), circularList.filteredNext(x -> (x >= 100)));
    }

    @Test
    void testEmptyFilterNext() {
        assertEquals(Optional.empty(), circularList.filteredNext(x -> x < 0));
    }
    private void fillList() {
        this.circularList.add(10);
        this.circularList.add(30);
        this.circularList.add(100);
    }
}