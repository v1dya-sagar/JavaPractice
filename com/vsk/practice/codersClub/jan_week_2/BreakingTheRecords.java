package com.vsk.practice.codersClub.jan_week_2;


import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(40);
        arr.add(21);
        arr.add(80);

        System.out.println(breakingRecords(arr));
    }

    public static List<Integer> breakingRecords(List<Integer> a) {
        int min = a.get(0);
        int max = a.get(0);
        int res1 = 0, res2 = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > max) {
                res1++;
                max = a.get(i);
            }
            if (a.get(i) < min) {
                res2++;
                min = a.get(i);
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(res1);
        res.add(res2);
        return res;
    }
}
