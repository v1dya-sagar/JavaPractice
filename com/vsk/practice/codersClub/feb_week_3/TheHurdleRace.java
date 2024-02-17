package com.vsk.practice.codersClub.feb_week_3;

import java.util.*;

public class TheHurdleRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> hurdles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            hurdles.add(scan.nextInt());
        }
        System.out.println(Collections.max(hurdles) > k? Collections.max(hurdles) - k : 0);
    }
}
