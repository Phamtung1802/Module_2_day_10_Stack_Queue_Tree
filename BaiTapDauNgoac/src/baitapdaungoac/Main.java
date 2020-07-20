package baitapdaungoac;

public class Main {
    public static void main(String[] args) throws Exception {
        MyStack dauNgoac=new MyStack("(– b + (b2 – 4*a*c)^0.5) / 2*a");
        System.out.println(dauNgoac.returnComment());
    }
}
