package com.vsk.practice.exercise;

public class ContinuosMaxSum {

    public static void printMaxSum(int arr[]) {

        int startIndex = 0,endIndex = 0,sum = 0,count = 0;
        int maxSum = 0;
        for(int i = 0;i < arr.length;i++) {

            if(arr[i] >= 0) {
                sum += arr[i];
                count++;
                if(i == arr.length - 1 && sum > maxSum) {
                    maxSum = sum;
                    endIndex = i;
                    startIndex = arr.length - count;
                }
            }
            else{
                if(sum > maxSum) {
                    maxSum = sum;
                    endIndex = i - 1;
                    startIndex = i - count;
                }
                sum = 0;
                count = 0;
            }

        }

        System.out.println("The Max Sum = " + maxSum);
        System.out.println("The Elements are");
        for(int i = startIndex;i <= endIndex;i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {

        int arr[] = {-8,-8,-10,-20,-40,50,-11,-67,-54,-34,-4,-1,-5,-1,0,0};
        printMaxSum(arr);

    }

}