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
        assertEquals("HEAD ->  9 -> 1 -> 7 -> 2 -> null", LinkedListsTest.toString());
    }


    @Test
    public void appendTest() {
        LinkedLists LinkedListsTest = new LinkedLists();
        LinkedListsTest.insert(2);
        LinkedListsTest.insert(7);
        LinkedListsTest.insert(1);
        LinkedListsTest.insert(9);
        LinkedListsTest.apeend(2);
        LinkedListsTest.toString();
        assertEquals("HEAD ->  9 -> 1 -> 7 -> 2 -> 2 -> null", LinkedListsTest.toString());
    }


    @Test
    public void insertBefTest() {
        LinkedLists LinkedListsTest = new LinkedLists();
        LinkedListsTest.insert(2);
        LinkedListsTest.insert(7);
        LinkedListsTest.insert(1);
        LinkedListsTest.insert(9);
        LinkedListsTest.insertBef(77,7);

        assertEquals("HEAD ->  9 -> 1 -> 77 -> 7 -> 2 -> null", LinkedListsTest.toString());
    }

    @Test
    public void insertAfter() {

        LinkedLists LinkedListsTest = new LinkedLists();
        LinkedListsTest.insert(2);
        LinkedListsTest.insert(7);
        LinkedListsTest.insert(1);
        LinkedListsTest.insert(9);


        assertEquals("HEAD ->  9 -> 1 -> 7 -> 77 -> null", LinkedListsTest.toString());

    }

//    @Test
//    public void findK() {
//
//        LinkedLists LinkedListsTest = new LinkedLists();
//        LinkedListsTest.insert(2);
//        LinkedListsTest.insert(7);
//        LinkedListsTest.insert(1);
//        LinkedListsTest.insert(9);
//
//
//        assertEquals(1, LinkedListsTest.findK(1));
//
//    }

    @Test
    public void TestzipLL() {

        LinkedLists LinkedListsTest = new LinkedLists();
        LinkedListsTest.insert(2);
        LinkedListsTest.insert(7);
        LinkedListsTest.insert(1);
        LinkedListsTest.insert(9);

        LinkedLists LinkedListsTest2 = new LinkedLists();
        LinkedListsTest2.insert(2);
        LinkedListsTest2.insert(7);
        LinkedListsTest2.insert(1);
        LinkedListsTest2.insert(9);

        LinkedLists result = LinkedLists.zipLL(LinkedListsTest, LinkedListsTest2);
        String x = "HEAD 9 -> 9 -> 1 -> 7 -> NULL";
        System.out.println(result);
        assertEquals(x,result.toString());

    }




}
