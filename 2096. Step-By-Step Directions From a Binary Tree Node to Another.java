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
     public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if(root==null||root.val==p||root.val==q){
            return root;
        }
        TreeNode leftChild=lowestCommonAncestor(root.left,p,q);
        TreeNode rightChild=lowestCommonAncestor(root.right,p,q);
        if(leftChild==null){
            return rightChild;
        }else if(rightChild==null){
            return leftChild;
        }else{
            return root;
        }
    }
    public boolean findpath(TreeNode root,int target,StringBuilder sb){
        if(root==null){
            return false;
        }
        if(root.val==target){
            return true;
        }
        sb.append("L");
        if(findpath(root.left,target,sb)){
            return true;
        }
        sb.setLength(sb.length()-1);
        sb.append("R");
        if(findpath(root.right,target,sb)){
            return true;
        }
        sb.setLength(sb.length()-1);
        return false;
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
         TreeNode lca = lowestCommonAncestor(root, startValue, destValue);
        
        // Find the path from LCA to startValue and from LCA to destValue
        StringBuilder pathToStart = new StringBuilder();
        StringBuilder pathToDest = new StringBuilder();
        
        findpath(lca, startValue, pathToStart);
        findpath(lca, destValue, pathToDest);

        // Convert path to start to all 'U's
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < pathToStart.length(); i++) {
            res.append('U');
        }
        res.append(pathToDest);
        
        return res.toString();
    }
}
