package thuchanhpalindrome;

import java.util.ArrayList;

public class MyStack {
    private int arr[];
    private int size;
    private int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return index;
    }
    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }

    public void check(){
        for(int i=0;i<arr.length;i++){
            System.out.println("phan tu= "+arr[i]);
        }
    }
}
