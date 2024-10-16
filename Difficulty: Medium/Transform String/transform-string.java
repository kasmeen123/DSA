//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String A, String B)
    {
        // code here
         if (A.length() != B.length()) {
            return -1;
        }
        
        int[] count = new int[256];
        
        // Count frequency of each character in A
        for (char c : A.toCharArray()) {
            count[c]++;
        }
        
        // Decrease count for each character in B
        for (char c : B.toCharArray()) {
            count[c]--;
        }
        
        // If there's any non-zero count, transformation is not possible
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return -1;
            }
        }

        // Now calculate the minimum moves
        int i = A.length() - 1;
        int j = B.length() - 1;
        int moves = 0;
        
        // Compare A and B from the end
        while (i >= 0) {
            // If A[i] and B[j] match, move both pointers
            if (A.charAt(i) == B.charAt(j)) {
                j--;
            } else {
                // If not, A[i] needs to be moved to the front
                moves++;
            }
            i--;
        }
        
        return moves;
    }
}