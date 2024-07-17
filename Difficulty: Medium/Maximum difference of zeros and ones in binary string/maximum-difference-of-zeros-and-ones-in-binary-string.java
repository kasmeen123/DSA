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
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.maxSubstring(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int maxSubstring(String S) {
        // code here
        //BRUTE FORCE
        // int max = -1;
        // for(int i = 0; i < S.length(); i++){
        //     int cnt0 = 0;
        //     int cnt1 = 0;
            
        //     for(int j = i; j < S.length(); j++){
               
        //         if(S.charAt(j) == '0'){
        //             cnt0++;
        //         }
        //         else{
        //             cnt1++;
        //         }
        //          int diff = cnt0 - cnt1;
        //         max = Math.max(max, diff);
        //     }
        // }
        // return max;
    
    int sum = 0;
    int max = Integer.MIN_VALUE;

    // Calculate the maximum sum of transformed values
    for (int i = 0; i < S.length(); i++) {
        // Replace '0' with 1 and '1' with -1
        sum += (S.charAt(i) == '0') ? 1 : -1;

        max = Math.max(max, sum);
        if (sum < 0) {
            sum = 0; // Reset sum if negative
        }
    }

    return (max == Integer.MIN_VALUE) ? -1 : max;
    }
}