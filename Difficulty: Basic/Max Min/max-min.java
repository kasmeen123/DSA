//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.findSum(a,n));
        }
        
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        // TC: O(N(log(N)))
        // Arrays.sort(A);
        // return A[0]+A[N-1];
        
        
        // TC: O(N)
        int max = A[0];
        int min = A[0];
        for(int i = 0; i < N; i++){
            if(A[i] > max) max = A[i];
            if(A[i] < min) min = A[i];
        }
        return max+min;
    }
}
