package Java_Dsa;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class TestStack {
    @Test
    public void testPushStack () throws Exception {

        Stack stack1 = new Stack();
        stack1.push(5);
        int answer = (int) stack1.peek();

        assertEquals(5,answer);
    }


    @Test
    public void testPop() throws Exception{
        Stack testStack1 = new Stack();
        testStack1.push(1);
        testStack1.push(2);
        testStack1.push(3);
        testStack1.push(4);
        System.out.println(testStack1.pop().toString());
        assertEquals(4,testStack1.pop());

    }

    @Test
    public  void testPeeking() throws Exception {
        Stack testStack2 = new Stack();
        System.out.println(testStack2.isEmpty());
        assertEquals(true,testStack2.isEmpty());
    }
}
