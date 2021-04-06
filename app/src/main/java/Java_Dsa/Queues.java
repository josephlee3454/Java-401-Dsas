package Java_Dsa;
import java.util.EmptyStackException;
public class Queues {
    private Node frontNode;
    private Node rearNode;
    private int stackSize;

    public void Queue(){
        this.frontNode = null;
        this.rearNode = null;
        this.stackSize = 0;
    }

    public int findYoSize(){ // returns the stackSize int which will be adding if you use enqueue decrementing if using dequeue
        return stackSize;
    }

    @Override
    public String toString() {
        return "Queues{" +
                "frontNode=" + frontNode +
                ", rearNode=" + rearNode +
                ", stackSize=" + stackSize +
                '}';
    }

    public Node enqueue(int value){
        Node newNode = new Node(value);
        if(frontNode == null ){
            frontNode = newNode;
            rearNode = newNode;
        }else{
            rearNode.next = newNode;
            rearNode = newNode;
            stackSize++;
        }
        return frontNode;
    }
    public int dequeue(){
        if(frontNode == null){
            throw new EmptyStackException();
        }
        int value = frontNode.value;
        frontNode = frontNode.next;
        stackSize--;
        return value;

    }


    public int peek(){
        if (frontNode== null){
            throw new EmptyStackException();
        }
        return frontNode.value;
    }





}

