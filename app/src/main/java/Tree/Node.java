package Tree;

public class Node {
    public int value;
    public Node left;
    public Node right;
//    public int data;

    public Node(int value){
        this.left = null;
        this.right = null;
        this.value = value;
    }
}
