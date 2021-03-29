package Java_Dsa;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {
    @Test
    public void insertTest() {
        LinkedLists LinkedListsTest = new LinkedLists();
        LinkedListsTest.insert(2);
        LinkedListsTest.insert(7);
        LinkedListsTest.insert(1);
        LinkedListsTest.insert(9);
        LinkedListsTest.toString();
        assertEquals("HEAD ->  9 ->  1 ->  7 ->  2 ->  NULL", LinkedListsTest.toString());
    }
}
