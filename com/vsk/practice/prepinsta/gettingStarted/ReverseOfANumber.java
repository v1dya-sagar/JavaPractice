package com.vsk.practice.prepinsta.gettingStarted;

public class ReverseOfANumber {
    public static void main(String[] args) {
        //variables initialization
        int num = -1234;
        boolean isNegative = num < 0 ? true: false;

        if (isNegative) {
            System.out.print("-");
            num = num * -1;
        }

        getReverse(num);
    }

    static void getReverse(int num)
    {
        if (num == 0)
            return;

        int rem = num % 10;
        System.out.print(rem);

        getReverse(num / 10);

    }
}
