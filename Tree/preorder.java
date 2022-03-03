class Solution {

    List<Integer> al = new ArrayList<>();

     public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return al;
    }
    
    public void preOrder(TreeNode root){
        if(root == null)
            return;
        else {
            al.add(root.val); 
            
            if(root.left != null)
                preOrder(root.left);
         
            if(root.right != null)
                preOrder(root.right);
         
          } 
    }
}
