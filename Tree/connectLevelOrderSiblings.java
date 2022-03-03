class Solution {
    public Node connect(Node root) {
        if(root == null || (root.left == null && root.right == null))
            return root;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            
            int noOfNodes = q.size();
            Node previousNode = null;
            
            for(int i=0 ; i < noOfNodes ; i++){
                Node n = q.poll();
                
                if(previousNode != null)
                    previousNode.next = n;
                
                previousNode = n;
                
                if(n.left != null)
                    q.offer(n.left);
                
                if(n.right != null)
                    q.offer(n.right);
            }
        }
        return root;
    }
}
