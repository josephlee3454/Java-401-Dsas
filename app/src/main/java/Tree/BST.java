package Tree;



import java.util.ArrayList;
public class BST extends BinaryTree {


    public BST(){}

    public Node addNode(Node root, int value){
        Node newnode = new Node(value);
        if(root == null){
            root = newnode;
            return root;
        }
        else if (newnode.value < root.value){
            root.left = addNode(root.left, newnode.value);
        }
        else{
            root.right = addNode(root.right, newnode.value);
        }
        return root;
    }


    public boolean conatains(Node current, int value){
        if(current == null)
            return false;
        if(value == current.value)
            return true;
        return value < current.value ? conatains(current.left,value):conatains(current.right,value);
    }


}
