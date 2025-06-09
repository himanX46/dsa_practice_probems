package linkedList;

public class ReverseLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node h = new Node(1);
        h.next = new Node(2);
        h.next.next = new Node(3);
        h.next.next.next = new Node(4);
        h.next.next.next.next = new Node(5);
        Node temp = h;
        System.out.println("initial ll::");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        findReverseLL(h);
    }

    private static void findReverseLL(Node h){
        Node curr = h;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        Node temp = prev;
        System.out.println();
        System.out.println("final ll::");
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
    }
}
