package Java_Dsa;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestQueues {

    @Test
    public void testEnqueue () throws Exception {

        Queues testQueue = new Queues();
        testQueue.enqueue(1);

        testQueue.enqueue(2);

        testQueue.enqueue(3);
        int answer = testQueue.peek();
        System.out.println(testQueue.peek());
        assertEquals(1, testQueue.peek());
    }

    @Test
    public void testDequeue() throws Exception{
        Queues testQueue2 = new Queues();
        testQueue2.enqueue(1);

        testQueue2.enqueue(2);

        testQueue2.enqueue(3);
        testQueue2.dequeue();
        int answer = testQueue2.peek();
        System.out.println(testQueue2.peek());
        assertEquals(2, testQueue2.peek());
    }


}
