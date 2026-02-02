1class Solution {
2    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
3        int original=image[sr][sc];
4        if(original==color)return image;
5        dfs(image,sr,sc,original,color);
6        return image;
7    }
8    private void dfs(int[][]image,int r,int c,int original,int color){
9        if(r<0||c<0||r>=image.length||c>=image[0].length)return;
10        if(image[r][c]!=original)return;
11        image[r][c]=color;
12        dfs(image,r+1,c,original,color);
13        dfs(image,r-1,c,original,color);
14        dfs(image,r,c+1,original,color);
15        dfs(image,r,c-1,original,color);
16    }
17}