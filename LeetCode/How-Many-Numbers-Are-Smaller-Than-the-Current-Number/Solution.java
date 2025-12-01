1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int[]ans=new int[nums.length];
4        for(int i=0;i<nums.length;i++){
5            int count=0;
6            for(int j=0;j<nums.length;j++){
7                if(nums[i]>nums[j])count++;
8            }
9            ans[i]=count;
10        }
11        return ans;
12    }
13}