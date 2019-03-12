class Solution {
    public ListNode reverseList(ListNode head) {
        // initialize the current node to the start of the linked list
        ListNode current = head;
        // initialize the previous pointer to null
        ListNode previous = null;
        // initialize the next pointer to null
        ListNode next = null;

        // iterate until we have reached the end of the list
        while(current != null){
          // assign next to the node next to current
          next = current.next;
          // the link next to current is now where previous is pointed to
          current.next = previous;
          // shift our pointers up
          previous = current;
          current = next;
        }
        // return previous, because previous is the new head of our list
        return previous;
    }
}
