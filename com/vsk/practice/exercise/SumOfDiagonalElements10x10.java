package com.vsk.practice.exercise;

import java.util.Scanner;

public class SumOfDiagonalElements10x10 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[10][10];
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
                arr[i][j]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<10;i++)
            sum=sum+arr[i][i];
        System.out.println(sum);
    }
}
