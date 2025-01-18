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
    public static void helper(List<List<Integer>> res,List<Integer>curr,TreeNode root,int sum)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null&&root.right==null)
        {
            curr.add(root.val);
            
            if(root.val==sum)
            {
                List<Integer>temp=new ArrayList<>();
                
                for(int i=0;i<curr.size();i++)
                {
                    temp.add(curr.get(i));
                }
                res.add(temp);
            }
            curr.remove(curr.size()-1);
            return;
        }
        curr.add(root.val);
        helper(res,curr,root.left,sum-root.val);
        helper(res,curr,root.right,sum-root.val);
        curr.remove(curr.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> res=new ArrayList<List<Integer>>();
    List<Integer> curr=new ArrayList<>();
    if(root==null)     
    {
        return res;
    }
    helper(res,curr,root,targetSum);
    return res;
    }
}