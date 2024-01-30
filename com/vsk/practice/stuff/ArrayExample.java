package com.vsk.practice.stuff;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] ar = {6,6,7,8,9};
        System.out.println(Arrays.toString(ar));
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        al.add(1);
        System.out.println(al);
        al2.addAll(al);
        System.out.println(al2);

    }
}
