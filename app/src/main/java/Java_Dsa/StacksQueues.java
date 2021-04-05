package Java_Dsa;

public class StacksQueues {
    private SqNode<N> top;

    public void Stack() {
    }

    public void push(N value) {

        SqNode<N> node = new SqNode<>();
        node.next = top;
        top = node;
    }

    public N pop() throws Exception {


        if (isEmpty()) {
            throw new Exception("EMPTY STACK");
        }

        N data = (N) top.value;
        top = top.next;

        return data;
    }

    public N peek() throws Exception {


        if (isEmpty()) {
            throw new Exception("EMPTY STACK");
        }
        return (N) top.value;
    }

    public boolean isEmpty() throws Exception {
//        if stack is empty -> return true

        return top == null;
    }
    public String toString(SqNode<N> top) {

        return toString(this.top);


    }

    private String toString (Node<N> current){

        if (current == null){
            return null;
        }
        return String.format("{%s} -> %s", current.value, toString(current.next));

    }
}
