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
        this.circularList.add(30);
        assertFalse(circularList.isEmpty());
    }
    @Test
    void testSize() {
        this.circularList.add(30);
        this.circularList.add(10);
        assertEquals(2 ,circularList.size());
    }

    @Test
    void testFilteredNext() {
    }
}