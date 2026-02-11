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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer>result=new ArrayList<>();
19        if(root==null)return result;
20        Queue<TreeNode>queue=new LinkedList<>();
21        queue.offer(root);
22        while(!queue.isEmpty()){
23            int levelSize=queue.size();
24            int lastValue=0;
25            for(int i=0;i<levelSize;i++){
26                TreeNode node=queue.poll();
27                lastValue=node.val;
28                if(node.left!=null)queue.offer(node.left);
29                if(node.right!=null)queue.offer(node.right);
30            }
31            result.add(lastValue);
32        }
33        return result;
34    }
35}