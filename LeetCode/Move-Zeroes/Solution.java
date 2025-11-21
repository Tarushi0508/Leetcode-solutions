class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int inspos=0;
        for(int num:nums){
            if(num!=0){
                nums[inspos++]=num;
            }
        }
        while(inspos<nums.length){
            nums[inspos++]=0;
        }
      
        
    }
}