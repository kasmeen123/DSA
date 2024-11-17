//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] mat = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(mat);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find minimum time required to rot all oranges.
    public int orangesRotting(int[][] mat) {
        // Code here
        
        class Pair {
        int row, col, steps;

        public Pair(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }
        int n = mat.length;
        int m = mat[0].length;
         Queue<Pair> q = new LinkedList<>();
        
        boolean [][] vis = new boolean [n][m];
        
        for(int i = 0; i < n; i++) {
            for(int j  = 0; j < m; j++) {
                if(mat[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    vis[i][j] = true;
                }
                else if(mat[i][j] == 0) {
                    vis[i][j] = true;
                }
            }
        }
        
        int[] delRow = {-1, 0, +1, 0};
        int[] delCol = {0, +1, 0, -1};
        int maxTime = 0;
        
            while (!q.isEmpty()) {

            Pair current = q.poll(); 
            maxTime = Math.max(maxTime, current.steps);
            for (int i = 0; i < 4; i++) {
            int nRow = current.row + delRow[i];
            int nCol = current.col + delCol[i];
            
             if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && !vis[nRow][nCol]) {
                    vis[nRow][nCol] = true; // Mark as visited
                    q.add(new Pair(nRow, nCol, current.steps + 1)); // Enqueue with incremented distance
                }
            }
            }
                    for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1 && !vis[i][j]) { // Fresh orange not visited
                    return -1; // Impossible to rot all oranges
                }
            }
        }

        return maxTime;

    }
}