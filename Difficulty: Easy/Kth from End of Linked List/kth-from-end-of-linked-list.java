//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}


// } Driver Code Ends
/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        
        // Node prev = null;
        // Node curr = head;

        
        //   while(curr != null) {
        //     Node next = curr.next;
            
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
            
        //     head = prev;
        
        //  int cnt = 1;
         
        //  Node node = head;
         
        //  while (node != null) {
        //       if(cnt == k) {
        //           return node.data;
        //       }
        //       node = node.next;
        //       cnt++;
        //  }
         
         
        //  return -1;
        
        // int cnt = 0;
        // Node curr = head;
        
        // while (curr != null) {
        //     curr = curr.next;
        //     cnt++;
        // }
        
         
        // curr = head;
        // int i = 0;
        // while (curr != null){
        //     if(i == cnt-k) return curr.data;
        //     curr = curr.next;
        //     i++;
        // }
        // return -1;
        
        
        Node fast = head;
        int i = 0;
        while (i < k) {
            if (fast == null) {
                return -1; // If k is greater than the length of the list
            }
            fast = fast.next;
            i++;
        }
        Node slow = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}


//{ Driver Code Starts.

public class GFG {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine().trim();
            if (!input.isEmpty()) {
                String[] numbers = input.split("\\s+");
                for (String num : numbers) {
                    if (!num.isEmpty()) {
                        arr.add(Integer.parseInt(num));
                    }
                }
            }

            int x = Integer.parseInt(br.readLine().trim());

            Node head = null;
            if (!arr.isEmpty()) {
                head = new Node(arr.get(0));
                Node tail = head;
                for (int i = 1; i < arr.size(); ++i) {
                    tail.next = new Node(arr.get(i));
                    tail = tail.next;
                }
            }

            Solution g = new Solution();
            // System.out.println(k);
            System.out.println(g.getKthFromLast(head, x));
        }
    }
}

// } Driver Code Ends