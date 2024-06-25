package com.vsk.practice.miscellaneous.Zoho;

public class RationalToMixedFraction {
    public static void main(String[] args) {
        float givenNumber = 1.75f;
        System.out.println(toMixedFraction(givenNumber));
    }
    public static String toMixedFraction(double number) {
        // Get the integer part
        int wholePart = (int) number;

        // Get the fractional part
        double fractionalPart = number - wholePart;

        // If there's no fractional part, simply return the integer part as string
        if (fractionalPart == 0) {
            return String.valueOf(wholePart);
        }

        // Convert the fractional part to a fraction dynamically
        int denominator = 1;
//	        System.out.println(Math.floor(fractionalPart));
        while (fractionalPart != Math.floor(fractionalPart)) {
            fractionalPart *= 10;
            denominator *= 10;
//	        System.out.println(Math.floor(fractionalPart));
        }
        int numerator = (int) fractionalPart;

        // Simplify the fraction
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // Form the mixed fraction representation
        return wholePart + " " + numerator + "/" + denominator;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
