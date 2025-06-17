package tree.practice;

public class InsertBST {
    private static class Node{
        Node left;
        Node right;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.left = new Node(0);
        int n = 6;
        Node curr = root;
        Node previous = null;
        while(curr!=null){
            previous = curr;
            if(n>curr.data){
                curr = curr.right;
            }else if(n<curr.data){
                curr = curr.left;
            }else{
                System.out.println("Key already exists");
                return;
            }
        }
        if(n>previous.data){
            previous.left = new Node(n);
        }else{
            previous.right = new Node(n);
        }
        printNodes(previous);
    }

    private static void printNodes(Node previous){
        if(previous==null){
            return;
        }
        while(previous!=null){
            System.out.println(previous.data);
            printNodes(previous.left);
            printNodes(previous.right);
        }
    }
}
