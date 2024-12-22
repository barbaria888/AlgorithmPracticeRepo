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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> sol = new ArrayList<Integer>();
        
        if(root==null) return sol;
        
        Stack<TreeNode> bag = new Stack<TreeNode>();
        bag.push(root);
        
        while(!bag.isEmpty()) {
        
            TreeNode node = bag.peek();
            if(node.left==null && node.right==null) {
                TreeNode pop = bag.pop();
                sol.add(pop.val);
            }
            else {
        
                if(node.right!=null) {
                    bag.push(node.right);
                    node.right = null;
                }
        
                if(node.left!=null) {
                    bag.push(node.left);
                    node.left = null;
                }
            }
        }
        return sol;
    }
}