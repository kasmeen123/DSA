//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java


// class Solution{
//     static int mod = 1000000007;
    
//     // Function to calculate the modular inverse of a with respect to mod using Fermat's Little Theorem
//     static long modInverse(int a, int mod) {
//         return power(a, mod - 2, mod);
//     }
    
//     // Function to calculate (x^y) % mod
//     static long power(long x, long y, int mod) {
//         long res = 1;
//         x = x % mod;
//         while (y > 0) {
//             // If y is odd, multiply x with the result
//             if (y % 2 != 0) {
//                 res = (res * x) % mod;
//             }
//             // y must be even now
//             y = y >> 1;
//             x = (x * x) % mod; // Change x to x^2
//         }
//         return res;
//     }

//     static int nCr(int n, int r) {
//         if (r > n) return 0;
//         if (r == 0 || n == r) return 1;
        
//         r = Math.min(r, n - r);
        
//         long result = 1;
        
//         // Calculate nCr % mod
//         for (int i = 0; i < r; i++) {
//             result = (result * (n - i)) % mod;
//             result = (result * modInverse(i + 1, mod)) % mod;
//         }
        
//         return (int) result;
//     }
// }

 class Solution{
     static int nCr(int n, int r) {
         
         int mod = 1000000007;
          if (r > n) return 0;
          if (r == 0 || n == r) return 1;
          
          int [] dp = new int [r+1];
          
          dp[0] = 1;
          
          for(int i = 1; i <= n; i++) {
              for(int j = Math.min(r, i); j > 0; j--) {
                  dp[j] = (dp[j] + dp[j-1]) % mod;
              }
          }
          return dp[r] % mod;
     }
 }
