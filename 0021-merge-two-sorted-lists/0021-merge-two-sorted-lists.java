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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode curNode = head;
        
        if(list1 == null){
            return list2;
        } else if (list2 == null){
            return list1;
        }
        
        while(true){
            System.out.print(list1.val + " : " + list2.val);
            
            if(list1.val < list2.val){
                System.out.println(" -> " + list1.val);
                curNode.val = list1.val;
                list1 = list1.next;
            } else {
                System.out.println(" -> " + list2.val);
                curNode.val = list2.val;
                list2 = list2.next;
            }
            
            if(list1 == null){
                curNode.next = list2;
                return head;
            } else if (list2 == null) {
                curNode.next = list1;
                return head;
            } else {
                curNode.next = new ListNode();
                curNode = curNode.next;
            }
        }
        
    }
}