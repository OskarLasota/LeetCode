package Algorithms;

public class Symmetric_Tree {

	
		
	class Solution {
		
	
	    public boolean isSymmetric(TreeNode root) {
	        return isSymmetric(root, root);
	    }
	    
	    
	    public boolean isSymmetric(TreeNode node1, TreeNode node2){
	        if((node1 == null) && (node2 == null))
	            return true; // both are null
	        if((node1 == null) || (node2 == null))
	            return false; //one is null one isn't
	        
	        return node1.val == node2.val && isSymmetric(node1.left, node2.right) && isSymmetric(node1.right, node2.left) ;
	    }
	
	}
	    
	
}
