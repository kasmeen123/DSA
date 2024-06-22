//{ Driver Code Starts
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

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        // Arrays.sort(arr);
        // int [] nums = new int [k];
        // for(int i = 0;  i < k; i++){
        //     nums[i] = arr[n-i-1];
        // }
        // return nums;
        
        //USING MIN HEAP
        PriorityQueue<Integer> pq = new PriorityQueue <> ();
        for(int i = 0; i < n; i++){
                pq.offer(arr[i]);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int index = 0;
        int [] ans = new int [k];
        while(!pq.isEmpty()){
            ans[index] = pq.poll();
            index++;
        }
     Arrays.sort(ans);
     int i = 0;
     int j = k-1;
     while(i < j){
         int temp = ans[i];
         ans[i] = ans[k-i-1];
         ans[k-i-1] = temp;
         i++;
         j--;
     }
      return ans;
    }
}