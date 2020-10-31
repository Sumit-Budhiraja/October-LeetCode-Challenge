class Solution {
    TreeNode x, y, prev;
    public void recoverTree(TreeNode root) {
        if (root == null) return;
		// first find x and y
        find(root);
		// then swap
        swap(x, y);
    }
		
	// goind to the end on left
    // looking for the first node, which val is greater than parent (left > root)
	// if will be writen to X
	// Then from top to bottom checking for the next value
	// in this case parent (prev) value should be greater than next; (root > right)
    public void find(TreeNode root) {
        if (root == null) return;
        find(root.left);
		if (prev != null && prev.val > root.val) {
            y = root;
            if (x == null) {
                x = prev;
            } else {
                return;
            }
        }
        prev = root;
        find(root.right);
    }
    
    private void swap(TreeNode one, TreeNode two) {
        int tmp = one.val;
        one.val = two.val;
        two.val = tmp;
    }
}