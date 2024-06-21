//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.minSum(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public static long minSum(int arr[], int n)
    {
        // Your code goes here
        //TC: O(N)
        //SC: O(N)
        // if(n == 0) return 0;
        // StringBuilder sb1 = new StringBuilder ();
        // StringBuilder sb2 = new StringBuilder ();
        // Arrays.sort(arr);
        // for(int i = 0; i < n; i++){
        //     if(i % 2 == 0){
        //     sb1.append(arr[i]);
        //     }
        //     else{
        //         sb2.append(arr[i]);
        //     }
        // }
        // String s1 = sb1.toString();
        // String s2 = sb2.toString();
        // long number1 = sb1.length() > 0 ? Long.parseLong(sb1.toString()) : 0;
        // long number2 = sb2.length() > 0 ? Long.parseLong(sb2.toString()) : 0;
        // return number1 + number2;
        
        //TC: O(N)
        //SC(): O(1)
        Arrays.sort(arr);
        long a = 0;
        long b = 0;
        int i = 0;
        while(i < n){
            a = a*10 + arr[i];
            i++;
            if(i < n){
            b = b*10 + arr[i];
            i++;
            }
        }
        return a+b;
    }
}