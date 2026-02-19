package neetcode.systemDesign;
import java.util.*;
public class MergeSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        LinkedList<ListNode> l1 = new LinkedList<>();
        LinkedList<ListNode> l2 = new LinkedList<>();
        LinkedList<ListNode> l3 = new LinkedList<>();
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(4);
        n1.next.next = new ListNode(5);
        l1.add(n1);
        ////
        ListNode n2 = new ListNode(1);
        n2.next = new ListNode(3);
        n2.next.next = new ListNode(4);
        l2.add(n2);
        ////
        ListNode n3 = new ListNode(2);
        n3.next = new ListNode(6);
        l3.add(n3);
        lists[0] = l1.get(0);
        lists[1] = l2.get(0);
        lists[2] = l3.get(0);
        mergeKLists(lists);
    }
    static ListNode mergeKLists(ListNode[] lists){
        int size = lists.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<size-1;i++){
            ListNode head = lists[i];
            while(head!=null){
                minHeap.add(head.val);
                head = head.next;
            }
        }
        LinkedList<ListNode> result = new LinkedList<>();
        ListNode head = new ListNode(-99);
        ListNode tail = new ListNode(-99);
        for(int i=0;i<minHeap.size();i++){
            ListNode newNode = new ListNode(minHeap.poll());
            tail.next = newNode;
        }
        tail.next = null;
        head = head.next;
        return head;
    }
}
