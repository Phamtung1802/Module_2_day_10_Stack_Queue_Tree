package baitapchuyensanghenhiphan;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStack {
    private ArrayList<Integer> mylist;
    private Integer input;
    private Integer leftOver;
    private Integer stackInput;
    private StringBuffer BinaryNum;

    public MyStack(Integer number) {
        this.input = number;
        this.leftOver = this.input;
        this.mylist = new ArrayList<Integer>();
        this.BinaryNum = new StringBuffer();
    }

    public StringBuffer convertDecimal() {
        while (this.leftOver.intValue() != 1) {
            this.stackInput = this.leftOver % 2;
            this.leftOver = this.leftOver / 2;
            this.mylist.add(stackInput);
        }
        this.mylist.add(1);
        Iterator<Integer> b = mylist.iterator();
        while (b.hasNext()) {
            this.BinaryNum.append(b.next().toString());
        }
        return this.BinaryNum;
    }
}
