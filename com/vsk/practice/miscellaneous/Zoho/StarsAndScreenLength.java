package com.vsk.practice.miscellaneous.Zoho;

public class StarsAndScreenLength {
    public static String justifySentence(String sentence, int screenLength) {
        String[] words = sentence.split(" ");
        int totalSpaces = words.length - 1;
        int totalStarsNeeded = screenLength - sentence.length();

        if (totalSpaces == 0) {
            // No spaces to justify (only one word in the sentence)
            return sentence + "*".repeat(totalStarsNeeded);
        }

        int starsPerSpace = totalStarsNeeded / totalSpaces;
        int extraStars = totalStarsNeeded % totalSpaces;

        StringBuilder justifiedSentence = new StringBuilder(words[0]);

        for (int i = 0; i < totalSpaces; i++) {
            justifiedSentence.append("*".repeat(starsPerSpace + (i < extraStars ? 1 : 0))).append(words[i + 1]);
        }

        return justifiedSentence.toString();
    }

    public static void main(String[] args) {
        String sentence = "Welcome to Zoho Corporation";
        int screenLength = 34;

        String output = justifySentence(sentence, screenLength);
        System.out.println(output);
    }
//    3. Given a sentence and screen length. Justify the sentence according to the screen length by replacing space with stars
//    Sample Input
//    Sentence = Welcome to Zoho Corporation (34-24 = 10 * )
//    Screen length = 34
//
//    Sample Output
//    Welcome****to***Zoho***Corporation

}
