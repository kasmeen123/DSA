//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long sequence(int n){
        // code here
        int mod = 1000000007;
        long sum = 0;
        long curr = 1;
        for(int i = 1; i <= n; i++) {
            long prod = 1;
            for(int j = 0; j < i; j++) {
                prod = (prod * curr) % mod;
                curr++;
            }
            sum = (sum + prod) % mod;
            
        }
        return sum;
    }
}