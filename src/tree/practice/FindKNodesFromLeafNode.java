package tree.practice;

public class FindKNodesFromLeafNode {
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
        System.out.println(findKDistantfromLeaf(root,2));
    }

    private static int findKDistantfromLeaf(Node root, int k){
        if(root==null && k<0){
            return 0;
        }else if(k==0){
            return 1;
        }
        return findKDistantfromLeaf(root.left,k-1)+findKDistantfromLeaf(root.right,k-1);
    }

}
