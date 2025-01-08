// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class P7 {
    // Function to find the middle node using slow and fast pointer
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Fast pointer moves twice as fast as the slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer by one
            fast = fast.next.next;   // Move fast pointer by two
        }

        return slow; // Slow pointer will point to the middle node
    }

    public static void main(String[] args) {
        // Test the solution
        P7 solution = new P7();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Find the middle node
        ListNode middle = solution.middleNode(head);
        System.out.println("Middle Node Value: " + middle.val); // Expected output: 3
    }
}


 //time complexity : O(n)
 //space complexity : O(1)

