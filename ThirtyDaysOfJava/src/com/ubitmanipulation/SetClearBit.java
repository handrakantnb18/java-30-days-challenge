package com.ubitmanipulation;

import java.util.BitSet;

public class SetClearBit {

    public static void main(String[] args) {

        BitSet bset = new BitSet(8);

        for (int i = 0; i < 10; i++)
            bset.set(i);

        System.out.println("The bitset before clear() operation is : "+bset);

        bset.clear(3);
        System.out.println("The bitset after clear() operation is  : " + bset);

        bset.clear(1, 5);
        System.out.println("The bitset after clear() operation is : "+ bset);

        bset.clear();
        System.out.println("The bitset after clear() operation is : " + bset);

    }
}
