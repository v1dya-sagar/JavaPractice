package com.vsk.practice.miscellaneous.Zoho;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInteger("VI"));
    }
    public static int romanToInteger(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            // Checks if the current value (num) is less than 1/4 of the accumulated value (ans).
            // If it is, subtracts the current value from ans, as it represents a subtraction in Roman format.
            // for example, "IV" represents 4, where 1 is subtracted from 5.
            // but remember to traverse from the end of the roman value
            if (4 * num < ans)
                ans -= num;
            else
                ans += num;
        }
        return ans;
    }
}
