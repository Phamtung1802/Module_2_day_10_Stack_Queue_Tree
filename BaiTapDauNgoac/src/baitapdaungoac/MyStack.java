package baitapdaungoac;

import java.util.ArrayList;

public class MyStack {
    private char[] str;
    private int size;
    private int index = 0;
    private boolean charRight=false;//)
    private boolean charLeft=false;//(

    public MyStack(String str) {
        this.size = str.length();
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
        if (this.index == 1) {
            throw new Exception("only one char");
        }
        if (isEmpty()) {
            throw new Exception("not Empty");
        }

        for (int j = this.index - 1;j>=0;j--){
            //check first ")"
            if(str[j]==')'){

                break;
            }
            return false;
        }

        for (int j = this.index - 1;j>=0;j--){
            //check first ")"
            if(str[j]==')'){
                charRight=true;
            }
            if (str[j]=='('){
                charLeft=true;
            }
            if(charRight==charLeft){
                charRight=false;
                charLeft=false;
            }
        }
        if (charRight==charLeft) {
            return true;
        }
        else return false;
    }
    public String returnComment() throws Exception {
        if(checkBracket()==true){
            return "Good";
        }
        else return "Wrong";
    }

}
