package com.vsk.practice.miscellaneous.Zoho;

public class CountOfAInInfiniteString {
    public static void main(String[] args) {
        String givenString = "ac"; // string repeats itself to infinity.
        // acacacacacacacacacacacacacacacacacacacac..... -> inifinity
        int n = 20; // find count of occurrences of 'a' in n letters.
        long count = 0;
        for(char c : givenString.toCharArray()){
            if(c == 'a')
                count++;
        }
//        System.out.println(count);
        // Calculate the number of full repetitions of S in N characters
        long fullRepetitions = n / givenString.length();

        // Calculate the number of 'a' characters in the full repetitions
        count *= fullRepetitions;

        // Calculate the remaining characters after the full repetitions
        int remainingCharacters = n % givenString.length();

        // Count 'a' in the remaining part
        for (int i = 0; i < remainingCharacters; i++) {
            if (givenString.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count);

    }
}
