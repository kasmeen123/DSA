//{ Driver Code Starts
import java.io.*;
import java.util.*;

class gfg {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int w = Integer.parseInt(br.readLine());

            String line = br.readLine();
            String[] tokens = line.split(" ");
            List<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] val = new int[array.size()];
            int idx = 0;
            for (int i : array) val[idx++] = i;

            String lin = br.readLine();
            String[] toke = lin.split(" ");
            List<Integer> array1 = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : toke) {
                array1.add(Integer.parseInt(token));
            }

            int[] wt = new int[array1.size()];
            idx = 0;
            for (int i : array1) wt[idx++] = i;

            // calling method knapSack() of class Solution
            System.out.println(new Solution().knapSack(w, wt, val));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return max value that can be put in knapsack of capacity W.
    
    static int help (int n, int W, int wt[], int val[], int index) {
        
        if(index == n) return 0;
        
        int pick = 0; 
        int nonPick = 0;
        
        nonPick = help(n, W, wt, val, index+1);
        
        if(W >= wt[index]) {
            pick = val[index] + help(n, W-wt[index ], wt, val, index+1);
        }
        return Math.max(pick, nonPick);
    }
    
    static int knapSack(int W, int wt[], int val[]) {
        // your code here
        int n = wt.length;
        return help(n, W, wt, val, 0);
        
    }
}
