import java.util.*;

public class DFS {

    // Perform DFS traversal on the graph
    public static void dfs(int vertex, boolean[] visited, Map<Integer, List<Integer>> graph) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : graph.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, graph);
            }
        }
    }

    public static void main(String[] args) {
        // Graph represented as adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(2));

        boolean[] visited = new boolean[6];

        // Perform DFS starting from vertex 0
        System.out.print("DFS traversal starting from vertex 0: ");
        dfs(0, visited, graph);
    }
}
