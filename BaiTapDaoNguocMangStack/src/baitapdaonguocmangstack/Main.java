package baitapdaonguocmangstack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayListStack<Integer> intList=new MyArrayListStack<Integer>();
        MyArrayListStack<String> strList=new MyArrayListStack<String>();

        for(int i = 0; i<5;i++){
            intList.push(i);
            System.out.println("added: "+intList.get(0));
        }
        System.out.println("List Before "+intList.getAll());
        Collections.reverse(intList.getAll());
        System.out.println("List After "+intList.getAll());

        for(Integer i=0;i<5;i++){
            strList.push("a"+i.toString());
            System.out.println("added: "+strList.get(0));
        }
        System.out.println("List Before "+strList.getAll());
        Collections.reverse(strList.getAll());
        System.out.println("List After "+strList.getAll());

    }
}
