//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;
        
System.out.println("~");
}
    }
}
// } Driver Code Ends

 
// User function Template for Java

class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        
        int n = mat.length;
        int c = -1;
        if(n == 1 && mat[0][0] == 0) return 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    cnt++;
                }
                if(cnt == n) c = i;
            }
        }
        if(c != -1) {
            int cnt = 0;
            for(int i = 0; i < n; i++) {
               if(mat[i][c] == 1) {
                   cnt++;
               }
    }
    if(cnt == n-1) return c;
}
return -1;
}
}