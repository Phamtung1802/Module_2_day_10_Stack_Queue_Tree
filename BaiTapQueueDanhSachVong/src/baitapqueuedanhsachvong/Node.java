package baitapqueuedanhsachvong;

public class Node<E> {
    public E data;
    public Node next;
    public Node prev;

    public Node(E data) {
        this.data = data;
        this.next = null;
        this.prev=null;
    }

}
