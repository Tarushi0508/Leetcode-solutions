1class Solution {
2    public int[] numberOfPairs(int[] nums) {
3        int n=nums.length;
4        boolean[]used=new boolean[n];
5        int pairs=0;
6        for(int i=0;i<n;i++){
7            if(used[i])continue;
8            for(int j=i+1;j<n;j++){
9                if(!used[j]&&nums[i]==nums[j]){
10                    pairs++;
11                    used[i]=true;
12                    used[j]=true;
13                    break;
14                }
15            }
16        }
17        int leftOver=n-2*pairs;
18        return new int[]{pairs,leftOver};
19    }
20}