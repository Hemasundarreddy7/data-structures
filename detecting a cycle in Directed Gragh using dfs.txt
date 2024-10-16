import java.util.*;

public class DetectCycleInDirectedGraph
 {

    static Boolean dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] visited, int[] path) {
        visited[node] = 1;
        path[node] = 1;
        for (Integer neighbor : adjList.get(node)) {
            if (visited[neighbor] == 0) {
                if (dfs(neighbor, adjList, visited, path)==true) {
                    return true;
                }
            }
            else if (path[neighbor] == 1) {
                return true;
            }
        }

        path[node] = 0;
        return false;
    }

    static Boolean hasCycle(ArrayList<ArrayList<Integer>> adjList, int numNodes) {
        int[] visited = new int[numNodes+1];
        int[] path = new int[numNodes+1];
        for (int i = 0; i < numNodes; i++) {
            if (visited[i] == 0) {
                if (dfs(i, adjList, visited, path)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int numNodes = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int numEdges = sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= numNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        System.out.println("Enter edges (format: start end):");
        for (int i = 0; i <numEdges; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            adjList.get(start).add(end);
        }

        sc.close();

        Boolean hasCycle = hasCycle(adjList, numNodes);
        if (hasCycle) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph does not contain a cycle.");
        }
    }
}

