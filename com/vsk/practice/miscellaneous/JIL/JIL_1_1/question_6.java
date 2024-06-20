package com.vsk.practice.miscellaneous.JIL.JIL_1_1;
import java.util.Scanner;
public class question_6 {
    public static void main(String[] args) {
        int age;
        char gender,marital_status;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age : ");
        age = scanner.nextInt();
        System.out.println("Enter Gender ( M or F) : ");
        gender = scanner.next().charAt(0);
        System.out.println("Enter Marital Status (Y or N) : ");
        marital_status = scanner.next().charAt(0);
        if(gender == 'F'){
            System.out.println("You will work in Urban Areas");
        } else if (gender == 'M' && (age>=20 && age<=40)) {
            System.out.println("You may work anywhere");
        } else if (gender == 'M' && (age>=40 && age<=60)) {
            System.out.println("You may work in Urban Areas");
        }
        else{
            System.out.println("Error");
        }

    }
}
