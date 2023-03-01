package step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CircularListTest {

    private CircularList list;
    @BeforeEach
    void setUp() {
        list = new CircularListImpl();
    }

    @Test
    void testCreation() {
        assertEquals(0, list.size());
    }
    @Test
    void testAddElement() {
        list.add(10);
        assertEquals(1, list.size());
    }
    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty());
    }
    @Test
    void testForwardIteration() {
        list.add(10);
        list.add(30);
        assertEquals(10, list.forwardIterator().next());
    }
    @Test
    void testBackwardIteration() {
        list.add(10);
        list.add(30);
        assertEquals(30, list.backwardIterator().next());
    }




}