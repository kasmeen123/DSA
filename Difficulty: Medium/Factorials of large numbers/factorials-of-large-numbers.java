//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int N) {
        // code here
        ArrayList <Integer> ans = new ArrayList <> ();
        ans.add(1);
        for(int i = 2; i <= N; i++) {
            multiply(ans, i);
        }
        Collections.reverse(ans);
        return ans;
    }
    
    public static void multiply(ArrayList <Integer> ans, int num) {
        int carry = 0;
        
        for(int i = 0; i < ans.size(); i++){
            int product = ans.get(i) * num + carry;
            ans.set(i, product % 10);
            carry = product / 10;
            
        }
         while (carry > 0) {
            ans.add(carry % 10);
            carry /= 10;
        }
    }
}

//{ Driver Code Starts.

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val : ans) System.out.print(val);
            System.out.println();
        }
    }
}
// } Driver Code Ends