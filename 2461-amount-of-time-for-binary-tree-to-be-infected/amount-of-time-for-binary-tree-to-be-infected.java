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
            public void check(TreeNode root,HashMap parents)
            {
                if(root==null)
                {
                    return;
                }
                if(root.left!=null)
                {
                    parents.put(root.left,root);
                    check(root.left,parents);
                }
                if(root.right!=null)
                {
                    parents.put(root.right,root);
                    check(root.right,parents);
                }
                
                
            }
            public TreeNode find(int start,TreeNode root)
            {
                if(root==null)
                {
                    return null;
                }
                if(root.val==start)
                {
                    return root;
                }
                TreeNode left=find(start,root.left);
                TreeNode right=find(start,root.right);
                return left!=null?left:right;
                
            }
            public int amountOfTime(TreeNode root, int start) {
                
                HashMap<TreeNode,TreeNode> parents=new HashMap<>(); 
                HashMap<TreeNode,Boolean> visited=new HashMap<>();
                Queue<TreeNode> q=new LinkedList<>();
                TreeNode infected=find(start,root);
                if(infected==null)
                {
                    return 0;
                }
                q.add(infected);
                int level=0;
                check(root,parents);
                visited.put(infected,true);
                while(!q.isEmpty())
                {
                    
                    int size=q.size();   
                    for(int i=0;i<size;i++)
                    {
                        TreeNode curr=q.poll();
                        if(parents.containsKey(curr)&&  !visited.containsKey(parents.get(curr)))
                        {
                            q.add(parents.get(curr));
                            visited.put(parents.get(curr),true);
                        }   
                        if(curr.left!=null&& !visited.containsKey   (curr.left))
                        {
                            q.add(curr.left);
                            visited.put(curr.left,true);
                        }
                        if(curr.right!=null && !visited.containsKey(curr.right))
                        {
                            q.add(curr.right);
                            visited.put(curr.right,true);
                        }            
                    
                    }
                    level++;
                }
                return level-1;    
            }
        }