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
public class Solution {
    public boolean hasCycle(ListNode head) {
        //USING HASHSET
        // HashSet <ListNode> set = new HashSet <> ();
        // ListNode node = head;
        // while(node != null) {
        //     if(set.contains(node)){
        //          return true;
        //     }
        //     set.add(node);
        //     node = node.next;
        // }
        // return false;

        // Floyd’s Tortoise and Hare Algorithm
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
             }
             return false;
    }
}