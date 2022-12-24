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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        
        ListNode listNode = new ListNode();
        ListNode currentNode =  new ListNode();
        
        while(true){
            currentNode.val = head.val;
            ListNode tmpNode = new ListNode();
            tmpNode.next = currentNode;
            currentNode = tmpNode;
            head = head.next;
            if(head == null) return tmpNode.next;
        }
    }
}