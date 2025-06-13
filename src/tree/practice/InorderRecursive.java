package tree.practice;

import java.util.ArrayList;
import java.util.List;

public class InorderRecursive {
    private static class Node{
        Node left;
        int data;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        List<Node> tree = new ArrayList<>();
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);
        traversal(newNode,"preorder");
        //traversal(newNode,"inorder");
        //traversal(newNode,"postorder");
    }

    //O(N),O(H)
    private static void traversal(Node root,String orderOfTraversal){
        Node temp = root;
        if(temp!=null && orderOfTraversal.equalsIgnoreCase("preorder")){
            System.out.println(temp.data);
            traversal(temp.left,"preorder");
            traversal(temp.right,"preorder");
        }
        if(temp!=null && orderOfTraversal.equalsIgnoreCase("inorder")){
            traversal(temp.left,"inorder");
            System.out.println(temp.data);
            traversal(temp.right,"inorder");
        }
        if(temp!=null && orderOfTraversal.equalsIgnoreCase("postorder")){
            traversal(temp.left,"postorder");
            traversal(temp.right,"postorder");
            System.out.println(temp.data);
        }
    }
}
