//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        
        //BRUTE FORCE
        // int majEle = -1;
        // for(int i = 0; i < size; i++){
        //     int cnt = 0;
        //     for(int j = 0; j < size; j++){
        //         if(a[i] == a[j]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt > size/2) majEle = a[i];
        // }
        
        // return majEle;
        
        //USING COUNT ARRAY
        // int majEle = -1;
        // int max = a[0];
        // for(int i = 0; i < size; i++){
        //     if(a[i] > max) max = a[i];
        // }
        // int [] cntArray = new int [max+1];
        // for(int i = 0; i < size; i++){
        //     cntArray[a[i]]++;
        // }
        // for(int i = 0; i < max+1; i++){
        //     if(cntArray[i] > size/2){
        //         majEle = i;
        //     }
        // }
        // return majEle;
        
        //USING HASHMAP
        // int majEle = -1;
        // HashMap <Integer, Integer> map = new HashMap <> ();
        // for(int i = 0; i < size; i++){
        //     if(map.containsKey(a[i])){
        //         map.put(a[i], map.get(a[i])+1);
        //     }
        //     else{
        //         map.put(a[i],1);
        //     }
        // }
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     if(entry.getValue() > size/2){
        //         majEle = entry.getKey();
        //         break;
        //     }
        // }
        // return majEle;
        
        //MOORE VOTING ALGO
        
        int ele = a[0];
        int cnt = 0;
        for(int i = 0; i < size-1; i++){
            
            if(a[i] == ele) {
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt == 0) ele = a[i+1];
        }
        cnt = 0;
        for(int i = 0; i < size; i++){
            if(a[i] == ele) cnt++;
        }
        if(cnt > size/2) return ele;
        else return -1;
    }
}