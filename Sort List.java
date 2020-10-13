class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode middle = getMiddle(head);
        ListNode midNext = middle.next;
        middle.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(midNext);
        ListNode ans = sortedMerge(left, right);
        return ans;
    }
    
    private ListNode sortedMerge(ListNode a, ListNode b) {
        ListNode res = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val <= b.val) {
            res = a;
            res.next = sortedMerge(a.next, b);
        } else {
            res = b;
            res.next = sortedMerge(a, b.next);
        }
        return res;
    }
    
    private ListNode getMiddle(ListNode head) {
        if (head == null) return head;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}