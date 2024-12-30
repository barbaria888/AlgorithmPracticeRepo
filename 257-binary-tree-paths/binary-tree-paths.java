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
    public static void helper(List<String> ans, String s,TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        if(root.right==null&&root.left==null)
        {
            s+=root.val;
            ans.add(s);
            return;
        }
         helper(ans,s+root.val+"->",root.left);
         helper(ans,s+root.val+"->",root.right);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans= new ArrayList<>();
        helper(ans,"",root);
        return ans;
    }
}