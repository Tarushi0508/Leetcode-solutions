class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIndex=0,maxIndex=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[minIndex])minIndex=i;
            if(nums[i]>nums[maxIndex])maxIndex=i;
        }
        if(minIndex>maxIndex){
            int temp=minIndex;
            minIndex=maxIndex;
            maxIndex=temp;
        }
        int c1=maxIndex+1;
        int c2=n-minIndex;
        int c3=(minIndex+1)+(n-maxIndex);
        return Math.min(c1,Math.min(c2,c3));

    }
}