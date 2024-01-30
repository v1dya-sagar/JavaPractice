package com.vsk.practice.codersClub.jan_week_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,5,7,9);
//        Collections.sort(list);
//        int min = 0 , max = 0;
//        for (int i = 0; i < list.size() - 1; i++) {
//            min += list.get(i);
//        }
//        for (int i = 1; i < list.size(); i++) {
//            max += list.get(i);
//        }
//        System.out.println(min + " " + max);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println(sum - Collections.max(list) + " " + (sum -  Collections.min(list)));

    }
}
