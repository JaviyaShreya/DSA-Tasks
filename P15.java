class P15 {
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head); // Reverse the list
        ListNode current = head, maxNode = head;

        while (current != null && current.next != null) {
            if (current.next.val < maxNode.val) {
                current.next = current.next.next; // Remove smaller node
            } else {
                current = current.next; // Move to next node
                maxNode = current; // Update maxNode
            }
        }

        return reverseList(head); // Reverse back and return
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
