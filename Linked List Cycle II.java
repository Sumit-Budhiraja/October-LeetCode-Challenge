public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
		
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){ 
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break; // cycle
        }
        
        if(fast.next == null || fast.next.next == null) return null; // no cycle
        
        slow = head;
        
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }