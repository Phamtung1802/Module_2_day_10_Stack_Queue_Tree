package baitapdaungoac;

public class Main {
    public static void main(String[] args) throws Exception {
        MyStack dauNgoac=new MyStack("(()()()()()()())");
        System.out.println(dauNgoac.returnComment());
    }
}
