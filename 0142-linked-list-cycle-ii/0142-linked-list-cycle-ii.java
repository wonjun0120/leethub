/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashMap;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> hashMap = new HashMap();
        ListNode curNode = head;
        int nodeIdx = 0;
        
        while(true){
            if(curNode == null) break;
            if(hashMap.containsKey(curNode)) return curNode;
            hashMap.put(curNode, nodeIdx);
            nodeIdx ++;
            curNode = curNode.next;
        }
        return null;
    }
}