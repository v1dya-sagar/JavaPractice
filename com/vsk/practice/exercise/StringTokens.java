package com.vsk.practice.exercise;

public class StringTokens {
    public static void main(String args[])
    {
        String s = "If you don't like something? , change.it.";
        String[] StringArray = s.split("[, . '?]+");

        for(int i=0; i< StringArray.length; i++)
        {
            System.out.println(StringArray[i]);
        }
    }
}
