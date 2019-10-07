package com.gof.behavioral.iterator;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class Node {
    String value;
    Node left;
    Node right;

    public Node(String value) {
        this.value = value;
    }

    public Node(final String value, final Node left, final Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void breadthFirstSearch(Node root, Consumer<String> c) {
        Deque<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node n = queue.removeFirst();
            c.accept(n.value);

            if (n.left != null) {
                queue.addLast(n.left);
            }
            if (n.right != null) {
                queue.addLast(n.right);
            }
        }
    }

    public void depthFirstSearch(Node root, Consumer<String> c) {
        Deque<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node n = queue.removeFirst();
            c.accept(n.value);

            if (n.left != null) {
                queue.addFirst(n.left);
            }
            if (n.right != null) {
                queue.addFirst(n.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node("1");
        Node node1_1 = new Node("1_1");
        Node node1_2 = new Node("1_2");
        Node node2_1 = new Node("2_1");
        Node node2_2 = new Node("2_2");
        Node node3_1 = new Node("3_1");
        Node node3_2 = new Node("3_2");

        root.left = node1_1;
        root.right = node1_2;

        node1_1.left = node2_1;
        node1_1.right = node2_2;

        node1_2.left = node3_1;
        node1_2.right = node3_2;

        root.breadthFirstSearch(root, System.out::println);
        System.out.println("____________________________");
        root.depthFirstSearch(root, System.out::println);
    }

}