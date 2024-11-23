//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String arr1[] = br.readLine().split(" ");
            int[] a = new int[arr1.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);

            String arr2[] = br.readLine().split(" ");
            int[] b = new int[arr2.length];

            for (int i = 0; i < arr2.length; i++) b[i] = Integer.parseInt(arr2[i]);

            if (b.length == 1 && b[0] == 0) {
                b = new int[0];
            }
            double res = new Solution().medianOfSortedArrays(a, b);

            if (res == (int)res)
                System.out.println((int)res);
            else
                System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public double medianOfSortedArrays(int a[], int b[]) {
        // Your Code Here
        int n = a.length;
        int m = b.length;
        int [] arr = new int [n+m];
        for(int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        for(int i = 0; i < b.length; i++) {
            arr[i+n] = b[i];
        }
        Arrays.sort(arr);
        if((n+m) % 2 != 0) return arr[(n+m)/2];
        else return (arr[(n+m)/2] + arr[(n+m)/2 - 1]) / 2.0;
    }
}