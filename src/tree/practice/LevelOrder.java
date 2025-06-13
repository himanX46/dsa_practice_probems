package tree.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
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
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> rootList = new ArrayList<>();
        rootList.add(root.data);
        list.add(rootList);
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> lst = new ArrayList<>();
            Node curr = queue.poll();
            if(curr.left!=null){
                queue.add(curr.left);
                lst.add(curr.left.data);
            }
            if(curr.right!=null){
                queue.add(curr.right);
                lst.add(curr.right.data);
            }
            if(lst.size()>0){
                list.add(lst);
            }
        }
        System.out.println(list);
    }
}
