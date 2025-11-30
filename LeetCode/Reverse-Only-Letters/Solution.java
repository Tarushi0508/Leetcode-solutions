1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[]arr=s.toCharArray();
4        int left=0;
5        int right=s.length()-1;
6        while(left<right){
7            if(!Character.isLetter(arr[left]))left++;
8            else if(!Character.isLetter(arr[right]))right--;
9            else{
10                char temp=arr[left];
11                arr[left]=arr[right];
12                arr[right]=temp;
13                left++;
14                right--;
15            }
16        }
17        return new String(arr);
18    }
19}