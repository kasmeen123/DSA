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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int length = 0;
        ListNode curr1 = head;
        while(curr1 != null){
            length++;
            curr1 = curr1.next;
        }
        if(n-length == 0) return head.next;
        // int temp = 0;
        // int diff = length - n;
        // ListNode curr2 = head;
        // while(temp != diff && curr2.next != null){
        //     temp++;
        //     if(temp-diff == 0){
        //         curr2.next = curr2.next.next;
        //         break;
        //     }
        //     else{
        //         curr2 = curr2.next;
        //     }

        //SIMPLIFYING THE CODE
        // int diff = length-n;
        // ListNode curr2 = head;
        // for(int i = 1; i < diff; i++){
        //     curr2 = curr2.next;
        // }
        // if(curr2.next != null){
        //     curr2.next = curr2.next.next;
        // }
        
        // return head;

    //BY REVERSING LINKEDLIST
    //     int cnt = 1;
    //     ListNode node = reverse(head);
    //     ListNode trav = node;
    //     if(n == 1) return reverse(node.next);
    //     while(trav != null && trav.next != null){
    //         if(n == cnt+1){
    //             trav.next = trav.next.next;
    //             break;
    //         }
    //         else{
    //             trav = trav.next;
    //         }
    //         cnt++;
    //     }
    //     return reverse(node);
    // }
    // public ListNode reverse(ListNode head){
    //     if(head == null || head.next == null) return head;
    //     ListNode prev = null;
    //     ListNode curr = head;
    //     while(curr != null){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     return prev;

    //USING FAST AND SLOW POINTER
    ListNode fast = head;
    for(int i = 0; i < n; i++){
        fast = fast.next;
    }
    ListNode slow = head;
    while(fast.next != null){
        fast = fast.next;
        slow = slow.next;
    }
    if(slow.next != null)
    slow.next = slow.next.next;
    return head;
    }
}