1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public TreeNode helper(int[]nums,int low,int high){
18        if(low>high) return null;
19        int mid=(low+high)/2;
20        TreeNode root = new TreeNode(nums[mid]);
21        root.left=helper(nums,low,mid-1);
22        root.right=helper(nums,mid+1,high);
23        return root;
24    }
25    public TreeNode sortedArrayToBST(int[] nums) {
26       int n=nums.length;
27       return helper(nums,0,n-1); 
28    }
29}