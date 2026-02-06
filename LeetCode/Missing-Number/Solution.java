1class Solution {
2    public int missingNumber(int[] nums) {
3        int n=nums.length;
4        int ExSum=n*(n+1)/2;
5        int ActSum=0;
6        for(int i=0;i<nums.length;i++){
7            ActSum+=nums[i];
8        }
9        return ExSum-ActSum;
10    }
11}