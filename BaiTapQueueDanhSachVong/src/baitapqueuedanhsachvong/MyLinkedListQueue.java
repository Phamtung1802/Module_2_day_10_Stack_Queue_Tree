package baitapqueuedanhsachvong;
import java.util.EmptyStackException;
import java.util.LinkedList;


public class MyLinkedListQueue<E> {
    private Node<E> head, rear;

    public MyLinkedListQueue() {
        this.head = null;
        this.rear = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.head = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        temp.prev=this.rear;
        this.rear = temp;
        this.rear.next=this.head;
        this.head.prev=this.rear;

    }

    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        this.rear.next=this.head;
        this.head.prev=this.rear;
        if (this.head == null)
            this.rear = null;

        return temp;
    }

    public Node getHead(){
        return this.head;
    }

    public Node getRear(){
        return this.rear;
    }

}
