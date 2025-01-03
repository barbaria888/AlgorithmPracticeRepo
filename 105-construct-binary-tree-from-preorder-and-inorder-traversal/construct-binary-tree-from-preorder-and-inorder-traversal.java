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
    public static TreeNode helper(int []pre,int plow,int phigh,int []in,int ilow,int ihigh)
    {
        if(plow>phigh)
        {
            return null;
        }
        TreeNode root= new TreeNode(pre[plow]);
        int i  =ilow;
        while(in[i]!=pre[plow]){i++;}
        int leftsize=i-ilow;
        root.left=helper(pre,plow+1,plow + leftsize, in,ilow,i-1 );
        root.right=helper(pre,plow+leftsize+1,phigh,in,i+1,ihigh);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return helper(preorder,0,n-1,inorder,0,n-1);
    }
}