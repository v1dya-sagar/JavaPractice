package com.vsk.practice.JIL_1_1;
import java.util.Scanner;
public class question_3 {
    public static void main(String[] args) {
        double quantity,cost,discount,total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Quantity (Number of units purchased) : ");
        quantity = scanner.nextInt();
        cost = quantity*100;
        if(cost>=1000){
            discount = (cost*0.1);
        } else {
            discount = 0;
        }
        total = cost - discount;
        System.out.println("Total Cost :" + total);
    }
}
