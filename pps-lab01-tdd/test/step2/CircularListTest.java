package step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

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
        this.fillList();
        assertEquals(3, list.size());
    }
    @Test
    void testIsEmpty() {
        assertTrue(list.isEmpty());
    }
    @Test
    void testForwardIteration() {
        this.fillList();
        assertEquals(Optional.of(10), list.forwardIterator().next());
    }
    @Test
    void testBackwardIteration() {
        this.fillList();
        assertEquals(Optional.of(40), list.backwardIterator().next());
    }

    @Test
    void testNextIterationOnEmptyList() {
        assertTrue(this.list.isEmpty());
        assertEquals(Optional.empty(), list.forwardIterator().next());
    }
    private void fillList() {
        list.add(10);
        list.add(30);
        list.add(40);
    }


}