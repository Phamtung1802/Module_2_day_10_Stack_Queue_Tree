package baitapdaonguocmangstack;

import java.util.ArrayList;

public class MyArrayListStack<E> {
   private ArrayList<E> stack;

   public MyArrayListStack(){
        stack=new ArrayList<E>();
   }

    public void push(E element) {
        this.stack.add(0,element);
    }

    public void pop(E element) {
        if(isEmpty())
            return;
        this.stack.remove(this.stack.size());
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public ArrayList<E> getAll(){

       return stack;
    }
    public E get(int a) {
        return stack.get(a);
    }
}
