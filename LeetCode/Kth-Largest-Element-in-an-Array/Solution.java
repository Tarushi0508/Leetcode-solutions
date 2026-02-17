1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer>res=new PriorityQueue<>();
4        for(int num:nums){
5            res.add(num);
6            if(res.size()>k){
7                res.poll();
8            }
9        }
10        return res.peek();
11    }
12}