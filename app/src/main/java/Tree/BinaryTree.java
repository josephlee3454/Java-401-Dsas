package Tree;
import java.util.*;
public class BinaryTree {
    public Node root = null;
//    public ArrayList<Integer> numbers = new ArrayList<>();


    public BinaryTree(Node root){
        this.root = root;
    }

//    public ArrayList<Integer> preOrder(){
//        if (root == null){
//            return numbers;
//        }
//        _preOrderTraversal(root);
//        return numbers;
//    }
//
//    public void _preOrderTraversal(Node newNode){
//        numbers.add(newNode.value);
//        if(newNode.left != null){
//            _preOrderTraversal(newNode.left);
//        }
//        if(newNode.right != null){
//            _preOrderTraversal(newNode.right);
//        }
//    }
//
//    public ArrayList<Integer> inOrder(){
//        if (root == null){
//            return numbers;
//        }
//        _preOrderTraversal(root);
//        return numbers;
//    }
//
//    public void _inOrderTraversal(Node newNode){
//        if(newNode.left != null){
//            _inOrderTraversal(newNode.left);
//        }
//        numbers.add(newNode.value);
//        if(newNode.right != null){
//            _inOrderTraversal(newNode.right);
//        }
//    }
//
//    public ArrayList<Integer> postOrder(){
//        if(root == null){
//            return numbers;
//        }
//        _postOrderTraversal(root);
//        return numbers;
//    }
//
//    public void _postOrderTraversal(Node newNode){
//        if(newNode.left != null){
//            _postOrderTraversal(newNode.left);
//        }
//        if(newNode.right != null){
//            _postOrderTraversal(newNode.right);
//        }
//        numbers.add(newNode.value);
//    }


    public int findMax(Node node)
    {
        if (node == null){
         return 0;
        }

        int maxCheck = node.value;
        int leftCheck = findMax(node.left);
        int rightCheck = findMax(node.right);

        if (leftCheck > maxCheck)
            maxCheck = leftCheck;
        if (rightCheck > maxCheck)
            maxCheck = rightCheck;
        return maxCheck;
    }



}
