//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.longSubarrWthSumDivByK(a, k);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int longSubarrWthSumDivByK(int[] a, int k) {
        // Complete the function
        
        // int n = a.length;
        // int maxL = 0;
        // for(int i = 0; i < n; i++) {
        //     int sum = 0;
        //     for(int j = i; j < n; j++) {
        //         sum += a[j];
        //         if(sum % k == 0) {
        //         maxL = Math.max(maxL, j-i+1);
        //     }
        //     }
        // }
        // return maxL;
        
        int n = a.length;
        int sum = 0;
        int maxL = 0;
        HashMap <Integer, Integer> map = new HashMap <> ();
        map.put(0, -1);

        for(int i = 0; i < n; i++) {
            sum += a[i];
            int rem = sum % k;
            if(rem < 0) rem += k;
            if(map.containsKey(rem)) {
                int l = i - map.get(rem);
                maxL = Math.max(maxL, l);
            }
            else{
                map.put(rem, i);
            }
        }
        return maxL;
    }
}
















