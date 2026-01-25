1class Solution {
2    public int findCenter(int[][] edges) {
3        int pair1[]=edges[0];
4        int pair2[]=edges[1];
5        if(pair1[0]==pair2[0] || pair1[0]==pair2[1])return pair1[0];
6        return pair1[1];
7    }
8}