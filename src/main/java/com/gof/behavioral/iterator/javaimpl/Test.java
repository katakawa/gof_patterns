package com.gof.behavioral.iterator.javaimpl;

import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Node root = new Node("root",
                new Node("1",
                        new Node("1.1",
                                new Node("1.1.1"),
                                new Node("1.1.2")),
                        new Node("1.2",
                                new Node("1.2.1"),
                                new Node("1.2.2"))
                ),
                new Node("2",
                        new Node("2.1",
                                new Node("2.1.1"),
                                new Node("2.1.2")),
                        new Node("2.2",
                                new Node("2.2.1"),
                                new Node("2.2.2"))));

//        for (Node node : root.breadthFirstSearch())
//            System.out.println(node);

        System.out.println();

        for (Iterator<Node> iterator = root.depthFirstSearch().iterator(); iterator.hasNext(); ) {
            Node node = iterator.next();
            System.out.println(node);
        }
    }
}
