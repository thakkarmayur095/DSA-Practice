class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> d = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        
        if(root == null)
            return d;
        
        if(root.left == null && root.right == null)
        {
            d.add(root.val* 1.0);
            return d;
        }
        
        q.add(root);
        
        while(!q.isEmpty())
        {
            int noOfElements = q.size();
            double sum = 0.0;
            for(int i=0 ; i < noOfElements ; i++){
                TreeNode node = q.remove();
                
                sum = sum + node.val;
                
                if(node.left != null)
                    q.add(node.left);
                
                if(node.right != null)
                    q.add(node.right);
            }
            
            d.add(sum/noOfElements);
        }
        return d;
       }
}
