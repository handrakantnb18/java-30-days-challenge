package com.wjavacorecoding;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastvsFailSafeTwo {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(101);
        al.add(102);
        al.add(103);
        al.add(104);
        al.add(105);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next() == 2) {
                itr.remove();
            }
        }

        System.out.println(al);

        itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next()== 3) {
                al.remove(3);
                System.out.println();
            }
        }
    }
}
