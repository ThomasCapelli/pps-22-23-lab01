import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    public static final int ITERATIONS = 100;
    private CircularList list;
    @BeforeEach
    void setUp() {
        list = new CircularListImpl();
    }

    @Test
    void testListEmpty() {
        assertEquals(0, list.size());
    }
    @Test
    void testCanAddElement() {
        list.add(10);
        assertEquals(1, list.size());
    }
    @Test
    void testAddMultipleElements() {
        for(int i = 0; i < ITERATIONS; i++) {
            list.add(i);
        }
        assertEquals(100, list.size());
    }
    @Test
    void testEmptyList() {
        assertTrue(list.isEmpty());
    }
    @Test
    void testNextElementEmptyList() {
        assertEquals(Optional.empty(), list.next());
    }
    @Test
    void testNextElement() {
        list.add(10);
        list.add(30);
        assertEquals(Optional.of(10), list.next());
        assertEquals(Optional.of(30), list.next());
    }
    @Test
    void testCircularNextElement() {
        list.add(10);
        list.add(30);
        list.next();
        list.next();
        assertEquals(Optional.of(10), list.next());
    }
    @Test
    void testPreviousElementEmptyList() {
        assertEquals(Optional.empty(), list.previous());
    }
    @Test
    void testPreviousElement() {
        list.add(10);
        list.add(30);
        assertEquals(Optional.of(30), list.previous());
    }
    @Test
    void testCircularPreviousElement() {
        list.add(10);
        list.add(30);
        list.previous();
        assertEquals(Optional.of(10), list.previous());
    }
    @Test
    void testReset() {
        list.add(10);
        list.add(30);
        list.add(50);
        list.next();
        list.previous();
        list.previous();
        list.reset();
        assertEquals(Optional.of(10), list.next());
    }

}
