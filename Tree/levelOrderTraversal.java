class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> al = new ArrayList<>();
        
        if(root == null)
            return al;
        
        if(root.left == null && root.right == null)
        {
            List<Integer> l = new ArrayList<>();
            l.add(root.val);
            al.add(l);
            return al;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            int levelSize = q.size();
            List<Integer> levelVal = new ArrayList<>();
            for(int i=0 ; i < levelSize ; i++){
                TreeNode data= q.remove();
                levelVal.add(data.val);
                
                if(data.left != null)
                    q.add(data.left);
                
                if(data.right != null)
                    q.add(data.right);
            }
            
            al.add(levelVal);
        }
        
        return al;
        
    }
