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
17    public TreeNode constructMaximumBinaryTree(int[] nums) {
18        if(nums==null)return null;
19        return build(nums,0,nums.length-1);
20    }
21    private TreeNode build(int[]nums,int left,int right){
22        if(left>right)return null;
23        int maxIdx=left;
24        for(int i=left;i<=right;i++){
25            if(nums[i]>nums[maxIdx]){
26                maxIdx=i;
27            }
28        }
29        TreeNode root=new TreeNode(nums[maxIdx]);
30        root.left=build(nums,left,maxIdx-1);
31        root.right=build(nums,maxIdx+1,right);
32        return root;
33    }
34}