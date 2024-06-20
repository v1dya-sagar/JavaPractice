package com.vsk.practice.miscellaneous.controlflow_statements;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Year of Birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Your Name");
            String name = scanner.nextLine();
            System.out.println("Your Name is " + name);

            int age = 2022 - year;
            if (age <= 0 || age > 100) {
                System.out.println("Invalid Year Entered , Age is not Practical");
            } else {
                System.out.println("Your Age is " + age);
            }
        }else{
            System.out.println("Invalid Year");
        }
    }
}
