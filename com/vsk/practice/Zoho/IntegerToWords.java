package com.vsk.practice.Zoho;

public class IntegerToWords {

    private static final String[] ONES = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {
        int number = 9; // Example number
        System.out.println(numberToWords(number));
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return "zero";
        }
        return convert(num);
    }

    private static String convert(int num) {
        if (num < 20) {
            return ONES[num];
        } else if (num < 100) {
            return TENS[num / 10] + (num % 10 != 0 ? "-" + ONES[num % 10] : "");
        } else {
            return ONES[num / 100] + " hundred" + (num % 100 != 0 ? " and " + convert(num % 100) : "");
        }
    }
}
