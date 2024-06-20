package com.vsk.practice.miscellaneous.JIL.JIL_3;

public class question_3_16 {
    public static void main(String args[])
    {
        String string = "Javatpoint is the best educational websites";
        StringBuffer sb= new StringBuffer(string);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
