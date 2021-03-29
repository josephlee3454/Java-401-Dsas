package Java_Dsa;

public class LinkedLists {

    public Node head = null;

    public static void main(String[] args){
        LinkedLists LinkedListsTest = new LinkedLists();
        LinkedListsTest.insert(2);
        LinkedListsTest.insert(7);
        LinkedListsTest.insert(1);
        LinkedListsTest.insert(9);
        System.out.println(LinkedListsTest.toString());

    }

    public String insert(int value){
        Node node = new Node(value);
        if(this.head != null) {

            node.next = this.head;
        }

            this.head = node;

        return "Node Inserted";
    }

    public Boolean includes(int val) {
        Node Curr = this.head;
        while (Curr != null) {
            if (Curr != null){
                System.out.println("val found");
            return true;
        }
            Curr = Curr.next;
    }
        System.out.println("val not found");
        return false;
    }
    public String toString(Node node){
        Node current = this.head;
        String finalString= "HEAD -> ";


        while(current != null){
            finalString = String.format("%s %s ->", finalString, current.value);

            current = current.next;
        }
        finalString = String.format("%s null", finalString);
        System.out.println(finalString);

        return finalString;
    }
}


class Node {

    public int value;
    Node next = null;

    public Node(int value) {
        this.value = value;
    }

    }


