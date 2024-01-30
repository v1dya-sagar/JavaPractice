package com.vsk.practice.codersClub.jan_week_1;

import java.util.*;

public class BillDivision {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int items = in.nextInt();
            int skipped = in.nextInt();

            int totalToSplit = 0;
            for (int i = 0; i < items; ++i) {
                int cost = in.nextInt();
                if (i != skipped) {
                    totalToSplit += cost;
                }
            }

            int paid = in.nextInt();

            if (totalToSplit / 2 >= paid) {
                System.out.println("Bon Appetit");
            }
            else {
                System.out.println(paid - totalToSplit / 2);
            }
        }
}
