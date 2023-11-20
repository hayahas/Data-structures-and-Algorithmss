package graphs;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GraphTest {

    @Test
    public void testAddVertex() {
        Graph<String> graph = new Graph<>(10);

        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        Vertex<String> vertexC = graph.addVertex("C");

        assertTrue(graph.getVertices().contains(vertexA));
        assertTrue(graph.getVertices().contains(vertexB));
        assertTrue(graph.getVertices().contains(vertexC));
        assertEquals(3, graph.size());
    }

    @Test
   public void testAddEdge() {
        Graph<Integer> graph = new Graph<>(10);

        Vertex<Integer> vertex1 = graph.addVertex(1);
        Vertex<Integer> vertex2 = graph.addVertex(2);
        Vertex<Integer> vertex3 = graph.addVertex(3);

        graph.addEdge(vertex1, vertex2, 5);
        graph.addEdge(vertex1, vertex3, 10);

        assertEquals(2, graph.getNeighbors(vertex1).size());
        assertEquals(5, graph.getNeighbors(vertex1).get(0).getWeight());
        assertEquals(10, graph.getNeighbors(vertex1).get(1).getWeight());
    }

    @Test
   public void testGetNeighbors() {
        Graph<Integer> graph = new Graph<>(10);

        Vertex<Integer> vertex1 = graph.addVertex(1);
        Vertex<Integer> vertex2 = graph.addVertex(2);
        Vertex<Integer> vertex3 = graph.addVertex(3);

        graph.addEdge(vertex1, vertex2, 5);
        graph.addEdge(vertex1, vertex3, 10);

        assertEquals(2, graph.getNeighbors(vertex1).size());

        LinkedList<Edge<Integer>> neighbors = graph.getNeighbors(vertex1);
        Edge<Integer> edge1 = neighbors.get(0);
        Edge<Integer> edge2 = neighbors.get(1);

        assertEquals(vertex1, edge1.getStart());
        assertEquals(vertex2, edge1.getDestination());
        assertEquals(5, edge1.getWeight());

        assertEquals(vertex1, edge2.getStart());
        assertEquals(vertex3, edge2.getDestination());
        assertEquals(10, edge2.getWeight());
    }

    @Test
    public void testGetVertices() {
        Graph<String> graph = new Graph<>(10);

        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        Vertex<String> vertexC = graph.addVertex("C");

        LinkedList<Vertex<String>> vertices = graph.getVertices();

        assertTrue(vertices.contains(vertexA));
        assertTrue(vertices.contains(vertexB));
        assertTrue(vertices.contains(vertexC));
        assertEquals(3, vertices.size());
    }

    @Test
    public void testSize() {
        Graph<String> graph = new Graph<>(10);

        Vertex<String> vertexA = graph.addVertex("A");
        Vertex<String> vertexB = graph.addVertex("B");
        Vertex<String> vertexC = graph.addVertex("C");

        assertEquals(3, graph.size());

        graph.addVertex("D");
        assertEquals(4, graph.size());
    }

    @Test
    public void testBreadthFirstTraversal() {

        Graph<String> graph = new Graph<>(10);

        Vertex<String> a = graph.addVertex("A");
        Vertex<String> b = graph.addVertex("B");
        Vertex<String> c = graph.addVertex("C");
        Vertex<String> d = graph.addVertex("D");

        graph.addEdge(a, b);
        graph.addEdge(a, c);
        graph.addEdge(b, d);
        graph.addEdge(c, d);


        List<Vertex<String>> result = graph.breadthFirstTraversal(a);


        assertEquals(a, result.get(0));
        assertEquals(b, result.get(1));
        assertEquals(c, result.get(2));
        assertEquals(d, result.get(3));
    }

}
