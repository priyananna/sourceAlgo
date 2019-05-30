import java.util.PriorityQueue;

/**
 * Created by priyankananna on 5/4/19.
 */
public class MergeKLists {
    public static class ListNode{
      int val;
      ListNode next;
      public ListNode(int val){
          this.val = val;
          this.next = null;
      }


    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, (a, b) -> a.val - b.val);

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        for (ListNode node : lists)
            if (node != null)
                queue.add(node);

        while (!queue.isEmpty()) {
            tail.next = queue.poll();
            tail = tail.next;

            if (tail.next != null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
    public static void main(String args[]){
        MergeKLists mergeKLists = new MergeKLists();
        ListNode listNode1 = new ListNode(70);
        ListNode listNode2 = new ListNode(30);
        ListNode listNode3 = new ListNode(90);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(10);
        ListNode listNode5 = new ListNode(50);
        ListNode listNode6 = new ListNode(60);
        listNode4.next = listNode5;
        listNode5.next = listNode6;

     //   ListNode[] lists;


      //  mergeKLists.mergeKLists(lists);
    }

}
