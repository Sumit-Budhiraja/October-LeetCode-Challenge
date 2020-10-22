class Solution {
    int count_left = 0;
    int count_right = 0   ; 
    public int minDepth(TreeNode root) {
        
        
        
        if(root == null){
            return 0;
        }
        
        if(root.left != null && root.right == null){
         int count_left2 = 1 +  minDepth(root.left);
            return count_left2;
        }
        
        if(root.left == null && root.right != null){
         int count_right2 = 1 +  minDepth(root.right);
            return count_right2;
        }
        
       if(root.left == null && root.right == null){
            return 1;
          // return Math.min( count_left, count_right)+1; 
        }
        
           int count_left = 1 +  minDepth(root.left);
            int count_right = 1 +  minDepth(root.right);
            // System.out.println( count_right);
            //  System.out.println( count_left);
             return Math.min( count_left, count_right);  
    }
}