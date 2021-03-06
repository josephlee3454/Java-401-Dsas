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
    public void apeend(int value) {
        Node curr;
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
        }
        curr = this.head;
        while (curr != null) {
            System.out.println(curr);
            if (curr.next == null) {

                curr.next = node;
                break;
            }
            curr = curr.next;
            System.out.println(curr);
        }
    }
    public void insertBef(int value, int valRep){
            Node temp;
            Node curr;
            Node node = new Node(value);
            if (this.head == null) {
                this.head = node;
            }
            curr = this.head;
            while(curr != null) {
                if (curr.next.value == valRep) {
                    temp = curr.next;
                    curr.next = node;
                    curr.next.next = temp;
                    break;
                }
                curr = curr.next;
            }


        }

    public void inserAfter(int value, int valRep) {
        Node temp;
        Node curr;
        Node node = new Node(value);
        if (this.head == null) {
            this.head = node;
        }
        curr = this.head;
        while (curr != null) {
            if (curr.value == valRep) {
                temp = curr.next.next;
                curr.next = node;
                curr.next.next = temp;
                break;
            }
            curr = curr.next;
        }


    }

    public int findK(int k) {
        Node curr = this.head;
        Node curr2 = this.head;
        int count = k;

        if (this.head == null) {
            return -1;
        }


        while (curr != null) {
            System.out.println(curr.value);
            System.out.println(curr2.value);

            if(count > 0){
               count --;
               curr = curr.next;
               continue;
            }
            curr = curr.next;
            curr2 = curr2.next;
        }


        return curr2.value;
    }




    public boolean includes(int val) {
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
    public String toString(){
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


