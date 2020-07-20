package thuchanhpalindrome;

import java.util.ArrayList;

public class MyStack {
    private char[] str;
    private int size;
    private int index = 0;

    public MyStack(String str) {
        this.size = str.length();
        this.str = new char[size];
        for (int i = 0; i < str.length(); i++) {
            this.push(str.charAt(i));
        }
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

    public Boolean palindrome() throws Exception {
        if (this.index == 1) {
            throw new Exception("only one char");
        }
        if (isEmpty()) {
            throw new Exception("not Empty");
        }
        for (int i = 0, j = this.index - 1; i < j; i++, j--) {
            if (str[i] != str[j]) {
                return false;
            }
        }
        return true;
    }

}
