package com.vsk.practice.exercise;

class ReverseInteger32Bit {
    public static void main(String[] args) {
        System.out.println(reverse(13456));
    }
    public static int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int rev = 0;
        while (x > 0) {
            int rem = x % 10;
            // checking for overflow
            if (rev > (Integer.MAX_VALUE) / 10) {
                return 0;
            }
            rev = rev * 10 + rem;
            x /= 10;
        }
        return sign * rev;
    }

}
