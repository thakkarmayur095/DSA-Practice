class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> al = new ArrayList<>();
        
        if(root == null)
            return al;
        if(root.left == null && root.right == null)
        {
            List<Integer> data = new ArrayList<>();
            data.add(root.val);
            al.add(data);
            return al;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int noOfNodes = q.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0 ; i < noOfNodes ; i++){
                TreeNode element = q.poll();
                subList.add(element.val);
                
                if(element.left != null)
                    q.offer(element.left);
                
                if(element.right != null)
                    q.offer(element.right);
            }
         al.add(0,subList);   
        }
        return al;
    }
}
