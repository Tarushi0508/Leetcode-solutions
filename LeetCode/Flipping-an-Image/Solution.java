class Solution {
    public void reverse(int[]ans,int start,int end){
        while(start<end){
            int temp=ans[start];
            ans[start]=ans[end];
            ans[end]=temp;
            start++;
            end--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            reverse(image[i],0,image[i].length-1);
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0)image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}