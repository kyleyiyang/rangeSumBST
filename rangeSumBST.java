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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        
            if (root.val <= R && root.val >= L) {
                sum = sum + root.val;
            }
            if (root.left!=null) {
                rangeSumBST(root.left, L, R);
            }
            if (root.right!=null) {
                rangeSumBST(root.right, L, R);
            }
        return sum;
    }
}
// very fast

class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        
            if (root.val <= R && root.val >= L) {
                sum = sum + root.val;
                if (root.left!=null) {
                    rangeSumBST(root.left, L, R);
                }
                if (root.right!=null) {
                    rangeSumBST(root.right, L, R);
                }
            } else if (root.left!=null && root.val > R) {
                rangeSumBST(root.left, L, R);
            } else if (root.right!=null && root.val < L) {
                rangeSumBST(root.right, L, R);
            }
        return sum;
    }
}
