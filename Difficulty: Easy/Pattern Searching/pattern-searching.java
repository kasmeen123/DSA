//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            String text = input[0];
            String pattern = input[1];
            Solution ob = new Solution();
            System.out.println(ob.search(text,pattern));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int search(String text, String pat) {
        // code here
        
        int n = text.length();
        int m = pat.length();
        
        for(int i = 0; i <= n-m; i++) {
            int j;
            for(j = 0; j < m; j++) {
                if(text.charAt(i+j) != pat.charAt(j)) {
                    break;
                }
            }
            if(j == m) return 1;
        }
        return 0;
    } 
};