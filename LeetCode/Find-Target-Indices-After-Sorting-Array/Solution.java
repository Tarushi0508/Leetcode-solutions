1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3       Arrays.sort(nums);
4       List<Integer>result=new ArrayList<>();
5       for(int i=0;i<nums.length;i++){
6        if(nums[i]==target){
7            result.add(i);
8        }
9       } 
10       return result;
11    }
12}