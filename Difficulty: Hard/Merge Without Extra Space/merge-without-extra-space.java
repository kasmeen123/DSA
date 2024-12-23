//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {
            String arr1[] = br.readLine().trim().split(" ");
            String arr2[] = br.readLine().trim().split(" ");

            int a[] = new int[arr1.length];
            int b[] = new int[arr2.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);
            for (int i = 0; i < b.length; i++) b[i] = Integer.parseInt(arr2[i]);

            Solution ob = new Solution();
            ob.mergeArrays(a, b);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < a.length; i++) {
                str.append(a[i] + " ");
            }
            for (int i = 0; i < b.length; i++) {
                str.append(b[i] + " ");
            }
            System.out.println(str);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        
        //using extra space O(n+m) and time complexity O(nlog(n+m)
        
        // int [] arr = new int [n+m];
        
        // for(int i = 0; i < n; i++) {
        //     arr[i] = a[i];
        // }
        
        // for(int i = 0; i < m; i++) {
        //     arr[i+n] = b[i];
        // }
    
        // Arrays.sort(arr);
        
        // for(int i = 0; i < n; i++) {
        //     a[i] = arr[i];
        // }
    
        // for(int i = 0; i < m; i++) {
        //     b[i] = arr[i+n];
        // }
        
        //using extra space O(n+m) and time complexity O(n+m)
        
        int left = 0;
        int right = 0;
        int index = 0;
        int [] arr = new int [n+m];
        while(left < n && right < m) {
            if(a[left] <= b[right]) {
                arr[index] = a[left];
                left++;
                index++;
            }
            else{
                arr[index] = b[right];
                right++;
                index++;
            }
        }
        while(left < n) arr[index++] = a[left++];
        while (right < m) arr[index++] = b[right++];
        
        for(int i = 0; i < n+m; i++){
            if(i < n) {
                a[i] = arr[i];
            }
            else{
                 b[i-n] = arr[i];
            }
        } 
    }
}
