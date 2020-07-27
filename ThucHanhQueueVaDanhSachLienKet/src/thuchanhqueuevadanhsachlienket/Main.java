package thuchanhqueuevadanhsachlienket;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        Queue<Node> nodequeue=new LinkedList<Node>();
        nodequeue.add(new Node(40));
        nodequeue.add(new Node(50));
        nodequeue.add(new Node(60));
        nodequeue.add(new Node(70));
        System.out.println(nodequeue);
        System.out.println(nodequeue.size());
        System.out.println(nodequeue);

    }
}
