package com.vsk.practice.JIL_1_2;

import java.util.Scanner;

public class question__13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = scanner.nextInt();
        int i=1 , sum1 =0;
        while (i<=n){
            if(i%2 == 0){
                sum1+=i;
            }
            i++;
        }
        System.out.println("sum with while loop " + sum1);

        int sum2 = 0;
        for (int j=1; j<=n; j++){
            if(j%2 == 0){
                sum2 += j;
            }
        }
        System.out.println("sum with for loop " + sum2);
        int sum3 = 0 , k = 2 ;
        do{
            if(k%2 == 0){
                sum3 += k;
            }
            k++;
        }while(k<=n);
        System.out.println("sum with do wile loop " + sum3);
    }
    }

