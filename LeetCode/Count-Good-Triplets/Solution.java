1class Solution {
2    public int countGoodTriplets(int[] arr, int a, int b, int c) {
3        int n=arr.length;
4        int count=0;
5        for(int i=0;i<n;i++){
6            for(int j=i+1;j<n;j++){
7                for(int k=j+1;k<n;k++){
8                    if(Math.abs(arr[i]-arr[j])<=a && Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c){
9                        count++;
10
11                    }
12                    
13                }
14            }
15        }
16        return count;
17    }
18}