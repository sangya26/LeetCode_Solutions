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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        list = inOrderTraversal(root, list);
        return list;
    }
    List<Integer> inOrderTraversal(TreeNode root, List<Integer> list){
        if (root == null)
            return list;
     
         inOrderTraversal(root.left, list);
        list.add(root.val);
         inOrderTraversal(root.right, list);
        return list;
    }
}
