package com.vsk.practice.miscellaneous.coding_exercises;

public class Main {
    public static void main(String[] args) {

        float miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("miles = "+ miles);

        SpeedConverter.printConversion(10.5);
    }
}
