1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length())return false;
4        char[]a=s.toCharArray();
5        char[]b=t.toCharArray();
6        Arrays.sort(a);
7        Arrays.sort(b);
8        return Arrays.equals(a, b);
9    }
10}