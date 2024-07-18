//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

public class Driverclass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }

    public static void printList(Node head, PrintWriter out) {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        // add your code here
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        Node curr = head;
        while (curr != null){
            if(curr.data == 0) cnt0++;
            else if(curr.data == 1) cnt1++;
            else cnt2++;
            curr = curr.next;
        }
         curr = head;
        while (cnt0 > 0) {
            curr.data = 0;
            curr = curr.next;
            cnt0--;
        }
        while (cnt1 > 0) {
            curr.data = 1;
            curr = curr.next;
            cnt1--;
        }
        while (cnt2 > 0) {
            curr.data = 2;
            curr = curr.next;
            cnt2--;
        }

        return head;
    }
}
