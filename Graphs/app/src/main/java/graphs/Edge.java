package graphs;

public class Edge<T extends Comparable<? super T>> implements Comparable<Edge<T>> {
    private Vertex<T> start;
    private Vertex<T> destination;
    private int weight;

    public Edge(Vertex<T> start, Vertex<T> destination, int weight) {
        this.start = start;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex<T> getStart() {
        return start;
    }

    public Vertex<T> getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Edge<T> o) {
        return Integer.compare(weight, o.getWeight());
    }

    @Override
    public String toString() {
        return destination + " (Weight: " + weight + ")";
    }
}
