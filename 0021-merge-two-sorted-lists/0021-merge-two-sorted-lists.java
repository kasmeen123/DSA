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
//BRUTE FORCE
// TC: O(N(log(N)))
// List<ListNode> nodes = new ArrayList<>();
//         while (list1 != null) {
//             nodes.add(list1);
//             list1 = list1.next;
//         }
//         while (list2 != null) {
//             nodes.add(list2);
//             list2 = list2.next;
//         }
//         Collections.sort(nodes, new Comparator<ListNode>() {
//             public int compare(ListNode n1, ListNode n2) {
//                 return n1.val - n2.val;
//             }
//         });
//         ListNode dummy = new ListNode();
//         ListNode current = dummy;
//         for (ListNode node : nodes) {
//             current.next = node;
//             current = current.next;
//         }
//         return dummy.next;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode ();
        ListNode curr = dummy;
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        while(curr1 != null && curr2 != null){
             if(curr1.val <= curr2.val){
                curr.next = curr1;
                curr1 = curr1.next;
            }
            else{
                curr.next = curr2;
                curr2 = curr2.next;
            }
           
            curr = curr.next;
        }
         if(curr1 != null) curr.next = curr1;
            else curr.next = curr2;
        return dummy.next;
    }
}

