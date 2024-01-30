package com.vsk.practice.JIL_2;

public class question_2_21 {
    public static void main(String[] args)
    {
        int[] arr = new int[] {8, 3 , 9, 4, -4, 6, 2};
        System.out.println("Array elements after sorting:");
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                int tmp = 0;
                if (arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}

