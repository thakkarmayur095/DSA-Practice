class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        
        if(root == null) 
            return al;
        
        
        if(root.left == null & root.right == null){
         al.add(root.val);
            return al;   
        }
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int noOfElements = q.size();
            
            for(int i=1 ; i <= noOfElements ; i++){
                
                TreeNode node = q.poll();
                
                if(i == noOfElements)
                    al.add(node.val);
                
                if(node.left != null)
                    q.offer(node.left);
                
                if(node.right != null)
                    q.offer(node.right);
            }
        }
        return al;
        
    }
}
