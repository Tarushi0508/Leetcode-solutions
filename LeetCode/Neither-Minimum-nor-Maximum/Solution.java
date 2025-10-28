class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max)max=nums[i];
            if(nums[i]<min)min=nums[i];

        }
        boolean found=false;
        for(int i=0;i<n;i++){
            if(nums[i]>min &&nums[i]<max){
                return nums[i];

            }

        }
        return -1;
    }
}