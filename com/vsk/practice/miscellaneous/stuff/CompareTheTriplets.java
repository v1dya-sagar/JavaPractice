package com.vsk.practice.miscellaneous.stuff;

import java.util.Scanner;

public class CompareTheTriplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] result = new int[2];
        result[0] = 0;
        result[1] = 0;
        for(int i = 0; i < 3; i++)
        {
            a[i] = scan.nextInt();
        }
        for(int i = 0; i < 3; i++)
        {
            b[i] = scan.nextInt();
        }
        for(int x = 0; x<3 ; x++){
                if(a[x] > b[x]){
                    result[0]++;
                } else if (a[x] < b[x]) {
                    result[1]++;
                }

        }
        System.out.println(result[0] + " " + result[1]);

    }

}
