1class Solution {
2    public int countGoodSubstrings(String s) {
3       int count=0;
4       for(int i=0;i<=s.length()-3;i++){
5        char a=s.charAt(i);
6        char b=s.charAt(i+1);
7        char c=s.charAt(i+2);
8        if(a!=b && b!=c && c!=a){
9            count++;
10        }
11       } 
12       return count;
13    }
14}