//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }

        return result.toString();
        
    }
}