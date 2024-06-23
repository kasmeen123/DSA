//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().maxRepeating(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int maxRepeating(int[] arr, int n, int k) {
        // code here
        HashMap <Integer, Integer> map = new HashMap <> ();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > max){
                ans = entry.getKey();
                max = entry.getValue();
            }
        }
        return ans;
        
        //  for (int i = 0; i < n; i++) {
        //     arr[arr[i] % k] += k;
        // }

        // // Step 2: Find the element with the maximum frequency
        // int max = arr[0], result = 0;
        // for (int i = 1; i < k; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //         result = i;
        //     }
        // }

        // // Return the original array to its original form
        // for (int i = 0; i < n; i++) {
        //     arr[i] = arr[i] % k;
        // }

        // return result;
    }
}