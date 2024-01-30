package com.vsk.practice.controlflow_statements;

import java.util.Scanner;

public class SumOf10NumFromUser {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count = 0, sum=0;

        while(true){
            int order = count+1;
            System.out.println("Enter Number #" + order + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                count++;
                sum += number;
                if(count == 10){
                    break;
                }
            }else{
                System.out.println("Invalid Number");
            }

            scanner.nextLine();

        }
        System.out.println("Sum = "+ sum);
        scanner.close();
    }
}
