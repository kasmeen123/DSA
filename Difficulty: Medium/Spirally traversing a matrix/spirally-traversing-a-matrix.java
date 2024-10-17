//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        int n = matrix.length;      // number of rows
        int m = matrix[0].length;   // number of columns
        int t = 0;                  // top boundary
        int b = n - 1;              // bottom boundary
        int l = 0;                  // left boundary
        int r = m - 1;              // right boundary

        ArrayList<Integer> ans = new ArrayList<>();

        while (t <= b && l <= r) {
            // Traverse from left to right along the top row
            for (int i = l; i <= r; i++) {
                ans.add(matrix[t][i]);
            }
            t++;  // Move the top boundary down

            // Traverse from top to bottom along the right column
            for (int i = t; i <= b; i++) {
                ans.add(matrix[i][r]);
            }
            r--;  // Move the right boundary left

            // Check if there are still rows remaining
            if (t <= b) {
                // Traverse from right to left along the bottom row
                for (int i = r; i >= l; i--) {
                    ans.add(matrix[b][i]);
                }
                b--;  // Move the bottom boundary up
            }

            // Check if there are still columns remaining
            if (l <= r) {
                // Traverse from bottom to top along the left column
                for (int i = b; i >= t; i--) {
                    ans.add(matrix[i][l]);
                }
                l++;  // Move the left boundary right
            }
        }

        return ans;
    }
}
