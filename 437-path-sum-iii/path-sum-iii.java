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
    
    public int pathSum(TreeNode root, long targetSum)
    {

        if(root==null)
        {
            return 0;
        }
        int count=helper(root,(long)targetSum);
        count+=pathSum(root.left,(long)targetSum)+pathSum(root.right,(long)targetSum);
        return count;
    }
    
    public int helper(TreeNode root, long sum){
        
        if(root==null)
        {
            return 0 ;
        }
        int count=0;
        if(sum==(long)root.val)
        {

            count++;
        }
        int left=helper(root.left,sum-(long)root.val);
        int right=helper(root.right,sum-(long)root.val);        
        return count+left+right;
    }
}