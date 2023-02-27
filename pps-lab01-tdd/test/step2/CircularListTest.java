package step2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}