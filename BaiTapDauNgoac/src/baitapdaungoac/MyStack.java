package baitapdaungoac;

import java.util.ArrayList;

public class MyStack {
    private char[] str;
    private String input;
    private int size;
    private int index = 0;
    char x;

    public MyStack(String str) {
        this.size = input.length();
        this.input=str;
        this.str = new char[size];

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
        if (x == '(' || x == '[' || x == '{') {
            for (int i = 0; i < input.length(); i++) {
                char x = this.input.charAt(i);
                if (x == '(' || x == '[' || x == '{') {
                    // Push the element in the stack
                    push(x);
                    continue;
                }
                if (isEmpty())
                    return false;

                switch (x) {
                    case ')':
                        pop();
                        if (x == '{' || x == '[')
                            return false;
                        break;
                     }

                }
            }
        }
    }

    public String returnComment() throws Exception {
        if(checkBracket()==true){
            return "Good";
        }
        else return "Wrong";
    }

}
