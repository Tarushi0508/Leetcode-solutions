1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int left=0;
5        int right=nums.length-1;
6        int maxSum=0;
7        while(left<right){
8            int sum=nums[left]+nums[right];
9            maxSum=Math.max(sum,maxSum);
10            left++;
11            right--;
12        }
13        return maxSum;
14    }
15}