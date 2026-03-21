package IK.systemDesign;
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
        ListNode[] lists = new ListNode[2];
        LinkedList<ListNode> l1 = new LinkedList<>();
        //LinkedList<ListNode> l2 = new LinkedList<>();
        //LinkedList<ListNode> l3 = new LinkedList<>();
        ListNode n1 = new ListNode(-2);
        n1.next = new ListNode(-1);
        n1.next.next = new ListNode(-1);
        n1.next.next.next = new ListNode(-1);
        l1.add(n1);
        ////
        /*ListNode n2 = new ListNode(1);
        n2.next = new ListNode(3);
        n2.next.next = new ListNode(4);
        l2.add(n2);*/
        ////
        /*ListNode n3 = new ListNode(2);
        n3.next = new ListNode(6);
        l3.add(n3);*/
        lists[0] = l1.get(0);
        lists[1] = new ListNode();
        //lists[1] = l2.get(0);
        //lists[2] = l3.get(0);
        ListNode head = mergeKLists(lists);
        while(head!=null){
            System.out.print(head.val+"->");
            head = head.next;
        }
    }
    static ListNode mergeKLists(ListNode[] lists){
        if(lists==null || lists.length==0){
            return null;
        }
        int size = lists.length;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        for(int i=0;i<size;i++){
            System.out.println(lists[i].val);
            ListNode head = lists[i];
            while(head!=null){
                minHeap.add(head);
                head = head.next;
            }
        }
        ListNode head = new ListNode(-99);
        ListNode tail = head;
        while(!minHeap.isEmpty()){
            ListNode smallest = minHeap.poll();
            tail.next = smallest;
            tail = tail.next;
        }
        return head.next;
    }
}
