import java.util.Map.Entry;

class Solution {
    public class Node {
        String var;
        double path = 1d;
        Map<Node, Double> neighbors = new HashMap<>();
        public Node(String var) { this.var = var; }
        
        @Override
        public boolean equals(Object o) {
            return var.equals(((Node)o).var);
        }
        
        @Override
        public int hashCode() {
            return var.hashCode();
        }
        
        @Override
        public String toString() {
        	return "Node:"+var;
        }
    }
    private Map<String, Node> graph = new HashMap<>();

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        for (int i = 0; i < values.length; i++) {
            List<String> e = equations.get(i);
            double value = values[i];
            insertIntoGraph(e, value);            
        }
        
        
        double[] results = new double[queries.size()];
        
        // executing bread-first-search BFS for each query 
        for (int i = 0; i < queries.size(); i++) {
            List<String> q = queries.get(i);
            
        	results[i] = bfs(q);
        }
        
        return results;
    }
    
    public double bfs(List<String> equation) {
        Node src = graph.get(equation.get(0));
        Node dst = graph.get(equation.get(1));
        
        if (src == null || dst == null)
        	return -1d;
        
        // e.g. a -> a
        if (src.equals(dst))
        	return 1d;
        
        Queue<Node> q = new LinkedList<>();
        q.add(src);
        Set<Node> visited = new HashSet<>();
        visited.add(src);
        src.path = 1d; // reseting current path to 1.0
        
        while (!q.isEmpty()) {
            Node node = q.poll();
            double currentValuePath = node.path;
            
            for (Entry<Node, Double> neighbor : node.neighbors.entrySet()) {
                Node n = neighbor.getKey();
                double value = neighbor.getValue();
                
                if (visited.contains(n)) {
                	src.path = 1;
                    continue;
                }
                
                // calculate the path
                n.path = value * currentValuePath;
                
                if (n.equals(dst))
                    return n.path;
                
                q.add(n);
                visited.add(n);

            }
        }
        
        return -1d;
    }
    
    public void insertIntoGraph(List<String> e, double value) {
        Node src = graph.getOrDefault(e.get(0), new Node(e.get(0)));
        Node dst = graph.getOrDefault(e.get(1), new Node(e.get(1))); 
        src.neighbors.put(dst, value);
        dst.neighbors.put(src, 1d/value);
        
        graph.put(src.var, src);
        graph.put(dst.var, dst);
    }
}