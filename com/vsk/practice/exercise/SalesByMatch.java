package com.vsk.practice.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(1);
        ar.add(3);
        ar.add(2);
        int n = ar.size();

        int result = sockMerchant(n, ar);
        System.out.println(result);

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int count = 0;
        for (Integer integer : ar) {
            if (hashtable.containsKey(integer)) {
                count++;
                hashtable.remove(integer);

            } else {
                hashtable.put(integer, 1);
            }
        }
        return count;
    }
}

