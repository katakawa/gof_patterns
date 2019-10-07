package com.gof.behavioral.iterator.javaimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Node {
    private final String name;
    private List<Node> children = new ArrayList<>();

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, Node... children) {
        this.name = name;
        this.children.addAll(Arrays.asList(children));
    }

    public String getName() {
        return this.name;
    }

    public List<Node> getChildren() {
        return this.children;
    }

    public Iterable<Node> breadthFirstSearch() {
        return () -> new NodeIterator(this, true);
    }

    public Iterable<Node> depthFirstSearch() {
        return () -> new NodeIterator(this, false);
    }

    @Override
    public String toString() {
        return "Node[" + this.name + "]";
    }
}
