
public class lca {
    //lca = lowest common acestor
    //recursion
    class TreeNode{

        public lca.TreeNode left;
        public lca.TreeNode right;
        
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
     if(root == p || root == q) return root;
TreeNode left =lowestCommonAncestor(root.left,p,q);     //if p and q is less than root  
TreeNode right = lowestCommonAncestor(root.right,p,q); // if p and q is more than root

        if(left != null && right != null) return root;
        
        return left == null? right: left;
    }
}
