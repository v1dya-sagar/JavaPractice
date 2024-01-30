package com.vsk.practice.stuff;

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.out;

public class LinkedLists {
    public static void main(String[] args) {
        // Scanner object is created
        Scanner scanner = new Scanner(System.in);
        // Read String input using scanner class
        String courseName = scanner.nextLine();
        // Print the scanned String
        out.println("Course: " + courseName);

        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        out.println(cars);
    }
}

