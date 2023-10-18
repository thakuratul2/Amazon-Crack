public class reverse_linklist {


    class ListNode{

        public reverse_linklist.ListNode next;
        
    }
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;

        while(head != null){
            ListNode next = head.next;
            head.next = dummy;
            dummy = head;
            head = next;
        }

        return dummy;
    }
}
