package com.vsk.practice.miscellaneous.JIL.JIL_1_1;
import java.util.Scanner;
public class question_1 {
    public static void main(String[] args) {
        double unit_price, quantity, discount, total_price,percentage = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Unit Price:");
        unit_price = scanner.nextInt();
        System.out.println("Enter Quantity:");
        quantity = scanner.nextInt();
        total_price = unit_price * quantity;
        if (quantity >= 100 && quantity <= 120) {
            percentage = 10.0;
            discount = total_price * 0.1;
        } else if (quantity > 120) {
            percentage = 15.0;
            discount = total_price * 0.15;
        } else {
            discount = 0;
        }
        System.out.println("Revenue From Sale: " + (total_price - discount) +"$");
        System.out.println("Discount: " + discount + "$("+ percentage +"%)");
    }
}
