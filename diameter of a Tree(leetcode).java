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

    public static int traversal(TreeNode root) {
        // base condition 
        if(root == null){
            return 0;
        }
        int leftMax = traversal(root.left);
        int rightMax = traversal(root.right);

        int max = Math.max(leftMax, rightMax) + 1;
        return max;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int dia1 = diameterOfBinaryTree(root.left);
        int dia2 = diameterOfBinaryTree(root.right);
        int dia3 = traversal(root.left) + traversal(root.right);
        return Math.max(dia3, Math.max(dia1, dia2));
    }
}
