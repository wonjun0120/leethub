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
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        
        int nodeLength = 0;
        ListNode currentNode = head;
        while(true){
            if(currentNode == null) break;
            nodeLength++;
            currentNode = currentNode.next;
        }
        
        ListNode result = head;
        for(int i = 0; i < nodeLength / 2; i++){
            result = result.next;
        }
        return result;
        
    }
}