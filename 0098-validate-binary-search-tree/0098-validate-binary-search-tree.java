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
    public boolean isValidBST(TreeNode root) {
        List<Integer> el = new ArrayList();
        this.getEl(root, el);
        
        System.out.println(el);
        for(int i = 1; i < el.size(); i++){
            if(el.get(i - 1) >= el.get(i)) return false;
        }
        
        return true;
        
    }
    
    public List<Integer> getEl(TreeNode root, List<Integer> el){
        if(root == null) return null;
        this.getEl(root.left, el);
        el.add(root.val);
        this.getEl(root.right, el);
        return el;
    }
}