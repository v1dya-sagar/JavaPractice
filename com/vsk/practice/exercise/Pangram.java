package com.vsk.practice.exercise;

import java.util.Arrays;

public class Pangram {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        char[] c = s.replaceAll(" ", "").toLowerCase().toCharArray();
        char[] res_char_array = removeDuplicate(c,c.length).toCharArray();
        Arrays.sort(res_char_array);
        System.out.println(res_char_array);
        char[] main = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        if(Arrays.equals(res_char_array,main)){
            System.out.println("pangram");
        }
        else {
            System.out.println("Not pangram");
        }
    }
    static String removeDuplicate(char[] str, int length)
    {
        int index = 0;
        for (int i = 0; i < length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}
