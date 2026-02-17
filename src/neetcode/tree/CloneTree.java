package neetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CloneTree {
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(100);
        root.left = new BinaryTreeNode(200);
        root.right = new BinaryTreeNode(300);
        root.left.left = new BinaryTreeNode(400);
        root.left.right = new BinaryTreeNode(500);
        clone_tree(root);
    }
    public static class BinaryTreeNode {
        Integer value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(Integer value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    static BinaryTreeNode clone_tree(BinaryTreeNode root) {
        // Write your code here.
        if(root==null){
            return null;
        }
        BinaryTreeNode rootNew = new BinaryTreeNode(root.value);
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(queue.size()>0){
            int size = queue.size();
            for(int i=0;i<size;i++){
                BinaryTreeNode node = queue.poll();
                if(node.left!=null){
                    rootNew.left = new BinaryTreeNode(node.left.value);
                    queue.add(node.left);
                }
                if(node.right!=null){
                    rootNew.right = new BinaryTreeNode(node.right.value);
                    queue.add(node.right);
                }
            }
        }
        return rootNew;
    }
}
