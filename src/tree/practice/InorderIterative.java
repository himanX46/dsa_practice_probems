package tree.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderIterative {
    private static class Node{
        Node left;
        int data;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        List<Node> tree = new ArrayList<>();
        Node newNode = new Node(1);
        newNode.left = new Node(2);
        newNode.right = new Node(3);
        newNode.left.left = new Node(4);
        newNode.left.right = new Node(5);
        dfs(newNode,5);
    }
    //O(N),O(H)
    private static Node dfs(Node root, int size){
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while(temp!=null || !stack.isEmpty()){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }
        }
        return null;
    }

}
