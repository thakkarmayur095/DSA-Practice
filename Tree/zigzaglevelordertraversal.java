class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> al = new ArrayList<>();
        
        if(root == null)
            return al;
        
        if(root.left == null && root.right == null)
        {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        int level = 1;
        
        while(!q.isEmpty()){
            
            List<Integer> levelData = new ArrayList<Integer>();
            
            int noOfNodes = q.size();
            
            
            for(int i = 0 ; i < noOfNodes ; i++){
            TreeNode node = q.poll();

                if(level%2 == 1)
                    levelData.add(node.val);
                else
                    levelData.add(0,node.val);
                
                if(node.left != null)
                        q.offer(node.left);
                
                    if(node.right != null)
                        q.offer(node.right);
                    
            }
            
            al.add(levelData);
            level++;
        }
        
        return al;
    }
}
