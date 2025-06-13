package tree.practice;

import java.util.*;

public class FindKDistancefromRoot {
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
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        int k = 2;
        Set<Node> hs = new HashSet<>();
        List<Node> list = new ArrayList<>();
        findKDistantfromLeaf(root, k, hs,list);
        System.out.println("list:: "+list);
        System.out.println("hs:: "+hs);
    }

    private static void findKDistantfromLeaf(Node root, int k, Set<Node> hs, List<Node> list){
        if(root==null){
            return;
        }
        list.add(root);
        if(root.left==null && root.right==null){
            if(list.size()-1>=k){
                hs.add(list.get(list.size()-1-k));
            }
            list.remove(root);
        }
        findKDistantfromLeaf(root.left,k,hs,list);
        findKDistantfromLeaf(root.right,k,hs,list);
    }
}
