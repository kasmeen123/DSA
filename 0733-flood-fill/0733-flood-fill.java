class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image [sr][sc];
         if (oldColor != color) {
            dfs(image, sr, sc, oldColor, color);
        }
        return image;
    }
        public void dfs(int [][] image, int x, int y, int oldColor, int color){
            if(x < 0 || x >= image.length || y < 0 || y >= image[0].length || image[x][y] != oldColor) return;
            image[x][y] = color;
            dfs(image, x+1, y, oldColor, color);
            dfs(image, x-1, y, oldColor, color);
            dfs(image, x, y+1, oldColor, color);
            dfs(image, x, y-1, oldColor, color);
            
        }
    }
