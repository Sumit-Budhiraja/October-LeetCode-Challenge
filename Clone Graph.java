class Solution {
    private Map<Node, Node> map = new HashMap();
    public Node cloneGraph(Node node) {
        if(node == null) 
            return null;
        if(map.containsKey(node)) 
            return map.get(node);
        Node root = new Node(node.val);
        map.put(node, root);
        for(Node ng : node.neighbors)
            root.neighbors.add(cloneGraph(ng));
        return root;
    }
}