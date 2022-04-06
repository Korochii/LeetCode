/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // This feels like an O(n) algo since we have to traverse each list once.
        // In this case, n is the max length between both ListNode.
        int globalCarry = 0;
        ListNode result = new ListNode();
        ListNode pointer = result;
        
        while (l1 != null && l2 != null) {
            int currL1 = l1.val;
            int currL2 = l2.val;
            int currSum = (currL1 + currL2 + globalCarry) % 10; 
            globalCarry = (currL1 + currL2 + globalCarry) / 10;
            
            ListNode temp = new ListNode(currSum);
            pointer.next = temp;
            pointer = pointer.next;
            l1 = l1.next;
            l2 = l2.next;
            
        }
        
        while (l1 != null) {
            int currL1 = l1.val;
            int currSum = (currL1 + globalCarry) % 10;
            globalCarry = (currL1 + globalCarry) / 10;
            
            ListNode temp = new ListNode(currSum);
            pointer.next = temp;
            pointer = pointer.next;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            int currL2 = l2.val;
            int currSum = (currL2 + globalCarry) % 10;
            globalCarry = (currL2 + globalCarry) / 10;
            
            ListNode temp = new ListNode(currSum);
            pointer.next = temp;
            pointer = pointer.next;
            l2 = l2.next;
        }
        
        if (globalCarry != 0) {
            ListNode temp = new ListNode(globalCarry);
            pointer.next = temp;
        }
        return result.next;
    }
}

