package tree;

public class BSTInsert {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.println("initial list->");
        printTree(root);
        insertNode(root,4);
        System.out.println("updated list->");
        printTree(root);
    }

    private static Node insertNode(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = insertNode(root.left,data);
        }else{
            root.right = insertNode(root.right,data);
        }
        return root;
    }

    private static void printTree(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+",");
        printTree(root.left);
        printTree(root.right);
    }
}
