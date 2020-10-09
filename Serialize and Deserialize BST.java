public class Codec {

    // Encodes a tree to a single string.
    public String serialize (TreeNode root) {
        if (root == null)
            return "";
        return String.valueOf (root.val) + "," + serialize (root.left) + "," + serialize (root.right);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize (String data) {
        String S [] = data.split (",");
        Queue <String> queue = new LinkedList ();
        for (String s: S)
            queue.add (s);
        return deserializeUtil (queue);
    }
    
    public TreeNode deserializeUtil (Queue <String> queue) {
        while (!queue.isEmpty ()) {
            String s = queue.poll ();
            if (s.equals (""))
                return null;
            TreeNode node = new TreeNode (Integer.valueOf (s));
            node.left = deserializeUtil (queue);
            node.right = deserializeUtil (queue);
            return node;
        }
        return null;
    }
}