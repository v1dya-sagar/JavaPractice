package com.vsk.practice.exercise;

import java.util.*;

public class SortBasedOnValues {
    public static void main(String[] args) {
        Map<String , Integer> givenMap = new HashMap<>(){{
            put("a" , 4);
            put("x" , 3);
            put("c" , 2);
            put("d" , 2);
            put("e" , 1);
        }};
        System.out.println(givenMap);
        givenMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
