package project4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSetTest {

    @Test
    void testConstructor() {
        IntegerSet set = new IntegerSet();
        assertEquals("-", set.toSetString());
    }

    @Test
    void testInsertElement() {
        IntegerSet set = new IntegerSet();
        set.insertsElement(5);
        set.insertsElement(10);
        assertEquals("5 10", set.toSetString());
    }

    @Test
    void testDeleteElement() {
        IntegerSet set = new IntegerSet();
        set.insertsElement(5);
        set.insertsElement(10);
        set.deleteElement(5);
        assertEquals("10", set.toSetString());
    }

    @Test
    void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.insertsElement(1);
        set1.insertsElement(2);
        set2.insertsElement(2);
        set2.insertsElement(3);

        IntegerSet unionSet = set1.union(set2);
        assertEquals("1 2 3", unionSet.toSetString());
    }

    @Test
    void testIntersection() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.insertsElement(1);
        set1.insertsElement(2);
        set2.insertsElement(2);
        set2.insertsElement(3);

        IntegerSet interseccionSet = set1.interseccion(set2);
        assertEquals("2", interseccionSet.toSetString());
    }

    @Test
    void testToSetString() {
        IntegerSet set = new IntegerSet();
        assertEquals("-", set.toSetString());

        set.insertsElement(1);
        set.insertsElement(5);
        set.insertsElement(10);
        assertEquals("1 5 10", set.toSetString());
    }

    @Test
    void testEqualTo() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        assertTrue(set1.equalTo(set2));

        set1.insertsElement(1);
        set1.insertsElement(2);
        set2.insertsElement(1);
        set2.insertsElement(2);

        assertTrue(set1.equalTo(set2));

        set2.insertsElement(3);
        assertFalse(set1.equalTo(set2));
    }

    @Test
    void testInsertOutOfRange() {
        IntegerSet set = new IntegerSet();
        set.insertsElement(-1);
        set.insertsElement(101);
        assertEquals("-", set.toSetString());
    }

    @Test
    void testDeleteOutOfRange() {
        IntegerSet set = new IntegerSet();
        set.insertsElement(50);
        set.deleteElement(-1);
        set.deleteElement(101);
        assertEquals("50", set.toSetString());
    }
}