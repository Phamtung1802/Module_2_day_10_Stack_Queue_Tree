package baitapqueuedanhsachvong;
import java.util.EmptyStackException;
import java.util.LinkedList;


public class MyLinkedListQueue<E> {
    private LinkedList<E> myQueue;

    public MyLinkedListQueue(){
        myQueue=new LinkedList<E>();
    }

    public boolean isEmpty(){
        if (myQueue.size()==0){
            return true;
        }
        return false;
    }

    public LinkedList<E> getAll(){
        if(isEmpty())
            throw new EmptyStackException();
        return myQueue;
    }

    public E get(int a){
        if(isEmpty())
            throw new EmptyStackException();
        return myQueue.get(a);
    }

    public void enQueue(E e){
        this.myQueue.add(0,e);
    }

    public void deQueue(){
        if(isEmpty())
            throw new EmptyStackException();
        this.myQueue.remove(this.myQueue.size()-1);
    }
}
