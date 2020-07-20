package baitapqueuedanhsachvong;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
      MyLinkedListQueue<String> myList=new MyLinkedListQueue<String>();
            MyLinkedListQueue<Integer> Queue=new MyLinkedListQueue<Integer>();
            myList.enqueue(1);
            myList.enqueue(2);
            myList.enqueue(3);
            myList.enqueue(4);
            myList.dequeue();
            myList.enqueue(5);
            myList.enqueue(7);
            System.out.println("head= "+ myList.getHead().data);
            System.out.println("head prev= "+ myList.getHead().prev.data);
            System.out.println("head next= "+ myList.getHead().next.data);
            System.out.println("rear= "+ myList.getRear().data);
            System.out.println("rear next=" +myList.getRear().next.data);
            System.out.println("rear prev=" +myList.getRear().prev.data);
    }
}
