package graphs;
import java.util.*;

public class Graph<T extends Comparable<? super T>> implements Comparable<Graph<T>> {

    public HashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyLists;
    private int numberOfVertices = 0;

    public Graph(int maxNumberOfVertices) {
        adjacencyLists = new HashMap<>(maxNumberOfVertices);
    }

    public Vertex<T> addVertex(T value) {
        Vertex<T> newVertex = new Vertex<>(value);
        adjacencyLists.put(newVertex, new LinkedList<>());
        numberOfVertices++;
        return newVertex;
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination) {
        addEdge(start, destination, 0);
    }

    public void addEdge(Vertex<T> start, Vertex<T> destination, int weight) {
        if (!adjacencyLists.containsKey(start) || !adjacencyLists.containsKey(destination)) {
            throw new IllegalArgumentException("Both vertices must be part of the graph.");
        }

        LinkedList<Edge<T>> edges = adjacencyLists.get(start);
        edges.add(new Edge<>(start, destination, weight));
    }


    public LinkedList<Vertex<T>> getVertices() {
        return new LinkedList<>(adjacencyLists.keySet());
    }

    public LinkedList<Edge<T>> getNeighbors(Vertex<T> vertex) {
        if (!adjacencyLists.containsKey(vertex)) {
            throw new IllegalArgumentException("Vertex is not part of the graph.");
        }

        return new LinkedList<>(adjacencyLists.get(vertex));
    }

    public int size() {
        return numberOfVertices;
    }
    public List<Vertex<T>> breadthFirstTraversal(Vertex<T> root) {
        List<Vertex<T>> visitedVertices = new ArrayList<>();
        Set<Vertex<T>> visited = new HashSet<>();

        Queue<Vertex<T>> queue = new LinkedList<>();
        visited.add(root);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex<T> currentVertex = queue.poll();
            visitedVertices.add(currentVertex);

            for (Edge<T> edge : adjacencyLists.get(currentVertex)) {
                Vertex<T> neighbor = edge.getDestination();
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }

        }

        return visitedVertices;
    }

    public Integer businessTrip(HashMap<String, HashMap<String, Integer>> graph, String[] trip) {
        if (trip.length <= 1) {
            return 0;
        }

        int totalCost = 0;

        for (int i = 0; i < trip.length - 1; i++) {
            String currentCity = trip[i];
            String nextCity = trip[i + 1];

            if (graph.containsKey(currentCity) && graph.get(currentCity).containsKey(nextCity)) {
                totalCost += graph.get(currentCity).get(nextCity);
            } else {
                return null;
            }
        }
        return totalCost;
    }
    @Override
    public int compareTo(Graph<T> o) {
        throw new UnsupportedOperationException("Graph does not implement compareTo()");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Vertex<T> vertex : adjacencyLists.keySet()) {
            result.append(vertex).append(" -> ").append(adjacencyLists.get(vertex)).append("\n");
        }

        return result.toString();
    }
}
