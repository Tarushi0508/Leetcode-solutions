/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution { 
        List<Integer>list=new ArrayList<>();
        int i=0;
        public void recoverTree(TreeNode root){
            inorder(root);
            Collections.sort(list);
            i=0;
            fixTree(root);
        }
        void inorder(TreeNode root){
            if(root==null)return;
            inorder(root.left);
            list.add(root.val);
            inorder(root.right);
        }
        void fixTree(TreeNode root){
            if(root==null)return;
            fixTree(root.left);
            root.val=list.get(i++);
            fixTree(root.right);
        }
        
    
}