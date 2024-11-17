//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// class Solution
// {
//     //Function to find distance of nearest 1 in the grid for each cell.
//     public int[][] nearest(int[][] grid)
//     {
//         // Code here
        
//         int n = grid.length;
//         int m = grid[0].length;
//         int [][] ans = new int [n][m];
//         int [][] vis = new int [n][m];
//         Queue<Pair<Integer, String>, Integer> q = new LinkedList<>();
        
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < m; j++) {
//                 if(grid[i][j] == 1) {
//                     q.push((i, j), 0);
//                     vis[i][j] = 1;
//                 }
//                 else {
//                     vis[i][j] = 0;
//                 }
//             }
//         }
        
//         int [] delrow = {-1, 0, +1, 0};
//         int [] delcol = {0, +1, 0, -1};
        
//         while (!q.isEmpty()) {
//             int row = q.front().first.first;
//             int second = q.front().first.second;
//             int steps = q.front().second;
//             q.pop();
//             ans[row][col] = steps;
//             for(int i = 0; i < 4; i++) {
//                 int nrow = row + delrow[i];
//                 int ncol = col + delcol[i];
//                 if(nrow >= 0 && nrow < 4 && ncol >= 0 && ncol ﻿namaste < 4 && vis[row][col] == 0) {
//                     vis[nrow][ncol] = 1;
//                     q.push((nrow ncol), steps+1);
//                 }
//             }
//         } 
        
//         return ans;
//     }
// }


class Solution {
    // Pair class to store (row, col) and the distance (steps)
    static class Pair {
        int row, col, steps;

        public Pair(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }

    // Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Resultant distance array
        int[][] ans = new int[n][m];
        // Visited array to avoid revisiting cells
        boolean[][] vis = new boolean[n][m];

        // Queue to perform BFS
        Queue<Pair> q = new LinkedList<>();

        // Initialize the queue with all cells containing 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    q.add(new Pair(i, j, 0)); // Enqueue cell with distance 0
                    vis[i][j] = true; // Mark as visited
                }
            }
        }

        // Directions for moving up, right, down, and left
        int[] delRow = {-1, 0, +1, 0};
        int[] delCol = {0, +1, 0, -1};

        // Perform BFS
        while (!q.isEmpty()) {
            Pair current = q.poll(); // Dequeue
            int row = current.row;
            int col = current.col;
            int steps = current.steps;

            ans[row][col] = steps; // Update distance in ans array

            // Explore neighbors
            for (int i = 0; i < 4; i++) {
                int nRow = row + delRow[i];
                int nCol = col + delCol[i];

                // Check bounds and if the cell is not visited
                if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && !vis[nRow][nCol]) {
                    vis[nRow][nCol] = true; // Mark as visited
                    q.add(new Pair(nRow, nCol, steps + 1)); // Enqueue with incremented distance
                }
            }
        }

        return ans;
    }
}
