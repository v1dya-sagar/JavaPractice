package com.vsk.practice.miscellaneous.JIL.JIL_2;

import java.util.Arrays;
import java.util.Scanner;

public class question_2_13 {
    public static void main(String[] args) {
        int flag = 0, loc = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter element "+ (i+1) +" : ");
            a[i] = scan.nextInt();
        }
        System.out.print("Enter the element to deleted : ");
        int x = scan.nextInt();
        for(int j = 0; j < a.length; j++) {
            if (a[j] == x) {
                flag = 1;
                loc = j;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            for(int k = loc + 1; k<n; k++){
                a[k-1] = a[k];
            }
        }
        else {
            System.out.println("Element not found in array");
        }
        System.out.print("After Deleting : ");
        for (int i = 0; i <=  n-2; i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
