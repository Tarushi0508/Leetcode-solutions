1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k<=1)return 0;
4        int count=0;
5        int left=0;
6        int product=1;
7        for(int right=0;right<nums.length;right++){
8            product*=nums[right];
9            while(product>=k){
10                product/=nums[left];
11                left++;
12            }
13            count+=right-left+1;
14        }
15        return count;
16    }
17}