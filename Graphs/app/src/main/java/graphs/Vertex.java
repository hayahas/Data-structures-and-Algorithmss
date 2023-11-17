package graphs;

import java.util.Objects;


import java.util.Objects;
public class Vertex<T extends Comparable<? super T>> implements Comparable<Vertex<T>> {
    private T value;

    public Vertex(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public int compareTo(Vertex<T> o) {
        return value.compareTo(o.getValue());
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
