package linkedList;

public class MiddleNodeLinkedList {
    public static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        System.out.println(findMiddleNode(head));
    }

    private static int findMiddleNode(Node head){
        int len = getLength(head);
        int mid = (len-1)/2;
        Node temp = head;
        while(mid>0){
            temp = temp.next;
            mid--;
        }
        return temp.data;
    }

    private static int getLength(Node head){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
