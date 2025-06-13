package tree.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LineByLine {
    private static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println(levelOrder(root));
    }

    static ArrayList<ArrayList<Integer>> levelOrder(Node node) {

        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        queue.add(node);

        while(!queue.isEmpty()){
            int n = queue.size();
            Node curr = queue.poll();
            n--;
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
            tempList.add(curr.data);
            if(n==0){
                results.add(tempList);
                tempList = new ArrayList<>();
            }
        }
        return results;
    }
}
