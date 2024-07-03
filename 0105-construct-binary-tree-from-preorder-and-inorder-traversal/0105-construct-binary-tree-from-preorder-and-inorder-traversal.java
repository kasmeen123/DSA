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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap <Integer, Integer> map = new HashMap <> ();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
        }
    
        public TreeNode helper(int [] preorder, int preStart, int preEnd, int [] inorder, int inStart, int inEnd, HashMap <Integer, Integer> map){
            
            if (preStart > preEnd || inStart > inEnd) {
                return null;
            }
            int root = preorder[preStart];
            TreeNode newRoot = new TreeNode(root);
            int rootIndexInInorder = map.get(root);
            int leftSubtreeSize = rootIndexInInorder - inStart;
            
            newRoot.left = helper(preorder, preStart+1, preStart+leftSubtreeSize, inorder,                  inStart,  rootIndexInInorder-1, map);
            
            newRoot.right = helper(preorder,  preStart+leftSubtreeSize+1, preEnd, inorder,                  rootIndexInInorder+1, inEnd, map);
            
            return newRoot;
            
        
    }
}