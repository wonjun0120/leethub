/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

/**
1
3 2 4
5 6 2 4
6 2 4
2 4
4
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList();
        
        if(root == null) return result;
        
        List<Node> stack = new ArrayList();
        stack.add(root);
        
        while(stack.size() != 0) { 
            Node currentNode = stack.get(0);
            stack.remove(0);
            
            result.add(currentNode.val);
            if(currentNode.children != null){
                List<Node> tmp = new ArrayList();
                tmp.addAll(currentNode.children);
                tmp.addAll(stack);
                stack = tmp;
            }
        }
        
        return result;
        
    }
}