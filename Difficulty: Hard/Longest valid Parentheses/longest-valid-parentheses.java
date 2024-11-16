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
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        // code here
        // int cnt = 0;
        // int max = 0;
        // Stack <Character> st = new Stack <> ();
        // // max = Math.max(max, cnt);
        // for(int i = 0; i < S.length(); i++) {
            
        //     char c = S.charAt(i);
        //     if(c == '(') {
        //         st.push(c);
        //     }
        //     else if(!st.isEmpty() && c == ')') {
        //             st.pop();
        //             cnt += 2;
        //             max = Math.max(max, cnt);
        //     }
            
        //     else {
        //         cnt = 0;
        //     }
        //  } 
        //  return max;
        
        int left = 0;
        int right = 0;
        int max = 0;
        
        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }
            if(left == right) {
                max = Math.max(max, 2*left); 
            }
            else if(right > left) {
                left = 0;
                right = 0;
            }
        }
        
        left = 0;
        right = 0;
        
        for(int i = S.length()-1; i >= 0; i--) {
            if(S.charAt(i) == '(') {
                left++;
            }
            else {
                right++;
            }
            if(left == right) {
                max = Math.max(max, 2*left); 
            }
            else if(left > right) {
                left = 0;
                right = 0;
            }
        }
        return max;
    }
}
