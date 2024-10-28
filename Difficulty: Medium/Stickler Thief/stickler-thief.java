//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 
System.out.println("~");
}
   }
}
// } Driver Code Ends


// class Solution
// {
//     //Function to find the maximum money the thief can get.
//     public int FindMaxSum(int arr[], int n)
//     {
        // Your code here
        // return help(arr, 0);
        
    // }
    
    // public int help(int [] arr, int index) {
    //     if(index >= arr.length) return 0;
    //     return Math.max(help(arr, index+1), help(arr, index+2)+ arr[index]);
    // }
// }


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int [] memo = new int [n];
        Arrays.fill(memo, -1);
        return help(arr, 0, memo);
        
    }
    
    public int help(int [] arr, int index, int [] memo) {
        if(index >= arr.length) return 0;
        
        if(memo[index] != -1) return memo[index];
        
        return memo[index] = Math.max(help(arr, index+1, memo), help(arr, index+2, memo)+ arr[index]);
    }
}