
package com.flinkedlist;

import java.util.ArrayList;
import java.util.List;

public class FindLengthofList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cricket");
        list.add("Footboll");
        list.add("Kabbadi");
        list.add("Vhaliboll");
        list.add("Kho-Kho");
        list.add("CaramBoard");
        list.add("Table Tenis");

        int size = list.size();
        System.out.println("List size : " + size);
    }
}
