//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            StringTokenizer stt = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(stt.nextToken());
            long k = Long.parseLong(stt.nextToken());
            long a[] = new long[n];
            long b[] = new long[n];

            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }

            Solution obj = new Solution();
            System.out.println(obj.isPossible(a, b, n, k) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        // Arrays.sort(a);
        // Arrays.sort(b);
        // for(int i = 0; i < n; i++){
        //     long temp = b[i];
        //     b[i] = b[n-i-1];
        //     b[n-i-1] = temp;
        // }
        // for(int i = 0; i < n; i++){
        //     if(a[i]+b[i] < k) return false;
        // }
        // return true;
        
          Arrays.sort(a);

        // Sort array b in ascending order and then reverse it
        Arrays.sort(b);
        for(int i = 0; i < n / 2; i++) {
            long temp = b[i];
            b[i] = b[n - i - 1];
            b[n - i - 1] = temp;
        }

        // Check if for each pair (a[i], b[i]), a[i] + b[i] >= k
        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;
            }
        }
        
        return true;
    }
}