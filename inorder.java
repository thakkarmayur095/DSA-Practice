class Solution {
    List<Integer> al = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return al;
    }
    
    public void inorder(TreeNode root){
        if(root == null)
            return;
        else {
            if(root.left != null)
                inorder(root.left);
         
            al.add(root.val); 
            
            if(root.right != null)
                inorder(root.right);
         
          } 
    }
}
