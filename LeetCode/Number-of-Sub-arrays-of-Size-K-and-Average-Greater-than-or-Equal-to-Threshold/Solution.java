1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int target=threshold*k;
4        int sum=0,count=0;
5        for(int i=0;i<arr.length;i++){
6            sum+=arr[i];
7            if(i>=k){
8                sum-=arr[i-k];
9            }
10            if(i>=k-1&&sum>=target){
11                count++;
12            }
13        }
14        return count;
15    }
16}