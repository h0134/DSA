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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root,result);
        int value = result.get(k-1);
        return value;

        
    }

    public void inorderTraversal(TreeNode root,List<Integer> result){
        if(root==null){
            return ;
        }

 inorderTraversal(root.left,result);
result.add(root.val);
 inorderTraversal(root.right,result);


    }
}