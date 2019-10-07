package com.gof.behavioral.iterator.javaimpl;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;

public final class NodeIterator implements Iterator<Node> {
    private final Deque<Iterator<Node>> iterators = new ArrayDeque<>();
    private final boolean breadthFirst;

    public NodeIterator(Node node, boolean breadthFirst) {
        this.iterators.add(Collections.singleton(node).iterator());
        this.breadthFirst = breadthFirst;
    }

    @Override
    public boolean hasNext() {
        return ! this.iterators.isEmpty();
    }

    @Override
    public Node next() {
        Iterator<Node> iterator = this.iterators.removeFirst();
        Node node = iterator.next();
        if (iterator.hasNext())
            this.iterators.addFirst(iterator);
        if (! node.getChildren().isEmpty()) {
            if (this.breadthFirst)
                this.iterators.addLast(node.getChildren().iterator());
            else
                this.iterators.addFirst(node.getChildren().iterator());
        }
        return node;
    }
}
