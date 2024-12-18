//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
// class Solution {
//     public static int aggressiveCows(int[] stalls, int k) {
//         // code here
//         Arrays.sort(stalls);
//         int n = stalls.length;
//         for(int i = 0; i < stalls[n-1] - stalls[0]; i++) {
//             if(canWePlace(stalls, n, i, k) == true) continue;
//             else return (i-1);
//         } 
//     }
    
//     public static boolean canWePlace(int [] stalls, int n, int dist, int k) {
//         int cntCows = 1;
//         int lastCow = stalls[0];
        
//         for(int i = 1; i < n-1; i++) {
//             if(stalls[i] - lastCow >= dist) {
//                 cntCows++;
//                 lastCow = stalls[i];
//             }
//         }
//         if(cntCows >= k) return true;
//         else return false;
//     }
// }



class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // Sort the stalls to calculate distances in order
        Arrays.sort(stalls);
        int n = stalls.length;

        // Start checking from minimum distance = 1
        int maxDistance = 0;

        for (int dist = 1; dist <= stalls[n - 1] - stalls[0]; dist++) {
            if (canWePlace(stalls, n, dist, k)) {
                maxDistance = dist; // Update maxDistance if cows can be placed
            } else {
                break; // If we can't place with this distance, stop checking further
            }
        }

        return maxDistance;
    }

    public static boolean canWePlace(int[] stalls, int n, int dist, int k) {
        int cntCows = 1; // Place the first cow in the first stall
        int lastCow = stalls[0]; // Last placed cow's position

        for (int i = 1; i < n; i++) {
            if (stalls[i] - lastCow >= dist) {
                cntCows++; // Place the next cow
                lastCow = stalls[i]; // Update the last cow's position
            }

            if (cntCows >= k) {
                return true; // All cows placed successfully
            }
        }

        return false; // Not enough stalls to place all cows
    }
}
