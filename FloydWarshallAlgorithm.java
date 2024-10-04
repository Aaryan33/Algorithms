import java.util.Arrays;
public class FloydWarshallAlgorithm {
    
    static final int INF = Integer.MAX_VALUE;

    // Floyd Warshall Algorithm

    public static int[][] floydWarshall(int[][] graph) {

        int n = graph.length; 
        int[][] dist = new int[n][n];

        // Initialize the distance matrix 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { 
                dist[i][j] = graph[i][j];
            }
        }

        // Compute shortest paths between all pairs of vertices
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]); 
                    }
                }
            }
        }
        return dist;
    }

        public static void main(String[] args) {
            int[][] graph = {{0, -1, 4, INF, INF},{INF, 0, 3, 2, 2},{INF, INF, 0, 5, INF}, {1, INF, INF, 0, INF}, {INF, INF, -3, INF, 0}};
        
            // Call the Floyd Warshall Algorithm and print the result

            int[][] result = floydWarshall(graph);

            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
        }
    }