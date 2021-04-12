package Java_Dsa;


import java.util.Stack;

public class PesudoQueuesWStacks<Q> {

    protected Stack<Q> dequeueStack;
    protected Stack<Q> enqueueStack;

    public  PesudoQueuesWStacks(){
        dequeueStack = new Stack<>();// we will take from this stack hence dequeue name
        enqueueStack = new Stack<>(); // we add to this stack hence the enqueue stack name

    }
    public void enqueue(Q value){

        while(dequeueStack != null){
            enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);
    }


    public Q dequeue(){
        if( dequeueStack == null && enqueueStack == null){
            return null;
        }
        while(enqueueStack != null){
            dequeueStack.push(enqueueStack.pop());
        }
        return dequeueStack.pop();
    }

    public boolean isEmpty(){
        if (enqueueStack == null && dequeueStack == null){
            return true;
        }
        return false;
    }
    public String toString () {

        return dequeueStack.toString();
//      out {2} -> {6} -> {12} -> null

    }

}
