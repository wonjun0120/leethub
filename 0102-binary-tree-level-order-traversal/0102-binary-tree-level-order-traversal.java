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

/**
3

*/
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList();
        List<TreeNode> queue = new ArrayList();
        queue.add(root);
        
        while(queue.size() != 0){
            List<TreeNode> tmpList = new ArrayList();
            List<Integer> tmpIntList = new ArrayList();
            for(int i = 0; i < queue.size(); i++){
                if(queue.get(i) == null) continue;
                tmpIntList.add(queue.get(i).val);
                tmpList.add(queue.get(i).left);
                tmpList.add(queue.get(i).right);
            }
            if(tmpIntList.size() == 0) break;
            result.add(tmpIntList);
            queue = tmpList;            
        }
        return result;
    }
}