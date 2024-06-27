package com.vsk.practice.miscellaneous.Zoho;

import java.util.Arrays;

public class maxSort {
    public static void main(String[] args) {
        // input : {1,2,764,51,9, 76, 45}

        // output : {100,200,467,150,900,670,450};

        // input : {1000, 5, 4, 6}
        // output : {1, 5000, 4000, 6000}


        int[] arr = {10000, 20000, 20001, 1,3,45};
        maxReverse(arr);

    }

    public static void maxReverse(int[] arr){

        int[] resultsFromMax = getMax(arr, 0, arr.length - 1);
        int maxLength = digits(resultsFromMax[0]);
        int[] arr2 = new int[arr.length];
        int maxDigits = digits(resultsFromMax[0]);

        for(int  i = 0; i < arr.length; i++){
            arr2[i] = sortNumber(arr[i]);
        }
        for(int i = 0 ; i < arr.length; i++){
            if(i == resultsFromMax[1]){
                continue;
            }
            for(int j = 1; j <= maxLength - digits(arr[i]); j++){
                arr2[i] = arr2[i] * 10;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }
    public static int sortNumber(int number){
        // 764 --> {7,6,4}
        int[] arrayOfNumber = new int[digits(number)];
        int index = 0;
        while(number > 0){
            arrayOfNumber[index++] = number%10;
            number /= 10;
        }

        // call Sort then arrayOfNumber = {4, 6, 7}
        Arrays.sort(arrayOfNumber);


        int finalNumber = 0;
        for(int num : arrayOfNumber){
            finalNumber = finalNumber * 10 + num;
        }
        return finalNumber;
    }


    public static int[] getMax(int[] array, int start, int end){
        int max = Integer.MIN_VALUE, index = -1;
        for(int i = start; i <= end; i++){
            if(max < array[i]){
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }


    public static int digits(int number){
        int digits = 0;
        while(number > 0){
            number /= 10;
            digits++;
        }
        return digits;
    }

}
