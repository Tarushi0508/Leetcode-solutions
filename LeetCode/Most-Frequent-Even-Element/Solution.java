1class Solution {
2    public int mostFrequentEven(int[] nums) {
3        Arrays.sort(nums);
4        int maxFreq=0;
5        int currFreq=0;
6        int ans=-1;
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]%2!=0){
9                currFreq=0;
10                continue;
11            }
12            if(i>0&&nums[i]==nums[i-1])currFreq++;
13            else{
14                currFreq=1;
15            }
16            if(currFreq>maxFreq){
17                maxFreq=currFreq;
18                ans=nums[i];
19            }
20        }
21        return ans;
22    }
23}