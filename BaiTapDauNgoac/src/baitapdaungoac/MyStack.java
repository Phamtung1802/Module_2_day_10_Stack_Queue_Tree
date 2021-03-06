package baitapdaungoac;

import java.util.ArrayList;

public class MyStack {
    private char[] str;
    private String input;
    private int size;
    private int index = 0;
    char x;

    public MyStack(String str) {
        this.input=str;
        this.size = input.length();
        this.str = new char[this.size];

    }

    public char pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return str[--index];
    }

    public void push(char element) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        this.str[index] = element;
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

    public Boolean checkBracket() throws Exception {
        for (int i = 0; i < input.length(); i++) {
            char x = this.input.charAt(i);
            if (x == '(') {
                push(x);
                continue;
            }
            if (isEmpty())
                return false;
            if (x==')'){
                pop();
                if (x == '(') {
                    return false;
                }
            }
        }
        if(isEmpty()==true){
            return true;
        }
        return false;
    }

    public String returnComment() throws Exception {
        if(checkBracket()==true){
            return "Good";
        }
        else return "Wrong";
    }

}
