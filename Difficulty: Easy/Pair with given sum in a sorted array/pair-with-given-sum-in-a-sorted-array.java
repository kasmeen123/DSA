//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        
        // brute force
        // int n = arr.length;
        // int cnt = 0;
        // for(int i = 0; i < n-1; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         if(arr[i] + arr[j] == target) {
        //             cnt++;
        //         }
        //     }
        // }
        // return cnt;
        
        
        int l = 0;
        int r = arr.length -1;
        int cnt = 0;
        
        while(l < r) {
            int sum = arr[l] + arr[r];
            
            if(sum == target) {
                //all elements are same
                if(arr[l] == arr[r]) {
                    int len = r - l + 1;
                    cnt += len * (len-1) / 2;
                    break;
                }
                //left duplicates
                int leftCnt = 1;
                while (l < r && arr[l] == arr[l+1]){
                    l++;
                    leftCnt++;
                }
                //right duplicates
                int rightCnt = 1;
                while (r > l && arr[r] == arr[r-1]){
                    r--;
                    rightCnt++;
                }
                cnt += leftCnt * rightCnt;
                l++;
                r--;
            }
            else if (sum < target) {
                l++;
            }
            else {
                r--;
            }
        }
        return cnt;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends