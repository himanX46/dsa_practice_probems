package linkedList;

public class MiddleNodeOptimized {
    static class Node{
        int value;
        Node next;
        public Node(int val){
            value = val;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);
        node.next.next.next = new Node(40);
        node.next.next.next.next = new Node(50);
        node.next.next.next.next.next = new Node(60);
        System.out.println(findMiddleNode(node));
    }
    static int findMiddleNode(Node head){
        if(head==null){
            return -1;
        }
        Node ptr1=head,ptr2=head;
        while(ptr2!=null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        return ptr1.value;
    }
}
