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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
        {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while (!q.isEmpty())
        {
            int levels = q.size();
            List<Integer> currAns = new ArrayList<>();
            for (int i = 0; i < levels; i++) {
                TreeNode temp = q.poll();
                if (flag)
                {
                    currAns.add(temp.val);
                }
                else
                {
                    currAns.add(0, temp.val); 
                }

                if(temp.left!=null) 
                {
                    q.add(temp.left);
                }
                if(temp.right!=null) 
                {
                    q.add(temp.right);
                }
            }
            res.add(currAns);
            flag= !flag;
        }
        return res;
    
    }
}