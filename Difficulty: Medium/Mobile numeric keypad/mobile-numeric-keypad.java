//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.getCount(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public long getCount(int n) {
        // Your code goes here
        int[][] moves = {
            {0, 8},        // 0
            {1, 2, 4},  // 1
            {1, 2, 3, 5},  // 2
            {2, 3, 6},  // 3
            {1, 4, 5, 7},  // 4
            {2, 4, 5, 6, 8},  // 5
            {3, 5, 6, 9},  // 6
            {4, 7, 8},  // 7
            {5, 7, 8, 9, 0},  // 8
            {6, 8, 9}       // 9
        };
        
        long [][] dp = new long [n+1][10];
        for(int j = 0; j < 10; j++) {
            dp[1][j] = 1;
        }
        
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k : moves[j]) {
                    dp[i][j] += dp[i-1][k];
                }
            }
        }
        
        long total = 0;
        for(int i = 0; i < 10; i++) {
            total += dp[n][i];
        }
        
        return total;
        
    }
}