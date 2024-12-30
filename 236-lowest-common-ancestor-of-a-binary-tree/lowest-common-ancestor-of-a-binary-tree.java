/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static boolean contains(TreeNode root,TreeNode q)
    {
        if(root==null)
        {
            return false;
        }
        if(root==q)
        {
            return true;
        }
        return contains(root.left,q) || contains(root.right,q);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root||q==root)
        {
            return root;
        }
        if(p==q)
        {
            return q;
        }
        boolean leftp= contains(root.left,p);
        boolean rightq= contains(root.right,q);
        if(leftp && rightq)
        {
            return root;
        }
        if(leftp && !rightq)
        {
            return lowestCommonAncestor(root.left,p,q);
        }
        if(!leftp && rightq)
        {
            return lowestCommonAncestor(root.right,p,q);
        }
        if(!leftp && !rightq)
        {
            return root;
        }
        return null;
    }

}