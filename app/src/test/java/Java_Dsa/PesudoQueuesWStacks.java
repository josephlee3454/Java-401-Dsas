package Java_Dsa;


import java.util.Stack;

public class PesudoQueuesWStacks<Q> {

    protected Stack<Q> dequeueStack;
    protected Stack<Q> enqueueStack;

    public  PesudoQueuesWStacks(){
        dequeueStack = new Stack<>();// we will take from this stack hence dequeue name
        enqueueStack = new Stack<>(); // we add to this stack hence the enqueue stack name

    }
    public void enqueue(Q value){ // pass in Q  Value which is the stacks node value

        while(dequeueStack != null){ // while the dequeue stack isnt null we wil pop everything and push itno the next stack untill it is null
            enqueueStack.push(dequeueStack.pop());
        }
        enqueueStack.push(value);
    }


    public Q dequeue(){
        if( dequeueStack == null && enqueueStack == null){ //  check to see if both stack are empty becuase you cant take something way if its not there
            return null;
        }
        while(enqueueStack != null){
            dequeueStack.push(enqueueStack.pop());// the objective is to move it to the dequeue stack to remove
        }
        return dequeueStack.pop(); // this will be the value after it has been pushed to the second stack
    }

    public boolean isEmpty(){
        if (enqueueStack == null && dequeueStack == null){
            return true;
        }
        return false;
    }

}
