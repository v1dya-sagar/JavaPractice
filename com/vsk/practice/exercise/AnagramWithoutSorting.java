package com.vsk.practice.exercise;

public class AnagramWithoutSorting {
    public static void main(String[] args) {
        if(isAnagram("abbc", "aabb")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static boolean isAnagram(String first, String second) {

        char[] charactersOfFirst = first.replaceAll(" ", "").toLowerCase().toCharArray();
        char[] charactersOfSecond = second.replaceAll(" ", "").toLowerCase().toCharArray();

        if (charactersOfFirst.length != charactersOfSecond.length) {
            return false;
        }

        int[] frequencies = new int[26];

        for (int i = 0; i < charactersOfFirst.length; i++) {
            frequencies[charactersOfFirst[i] - 'a']++;
            frequencies[charactersOfSecond[i] - 'a']--;
        }

        for (int frequency : frequencies) {
            if (frequency != 0)
                return false;
        }

        return true;
    }
}
