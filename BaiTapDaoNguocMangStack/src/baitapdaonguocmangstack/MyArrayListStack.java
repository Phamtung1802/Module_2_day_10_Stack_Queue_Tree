package baitapdaonguocmangstack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayListStack<E> {
   private ArrayList<E> stack;

   public MyArrayListStack(){
        stack=new ArrayList<E>();
   }

    public void push(E element) {
        this.stack.add(0,element);
    }

    public E pop() {
        if(isEmpty())
            throw new EmptyStackException();
        E obj=this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return obj;
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
