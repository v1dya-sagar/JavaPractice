package com.vsk.practice.exercise;

public class ZeroAtTheEnd {
    public static void main(String[] args) {
        String s = "098070980320", s1 = " ";
        int count = 0;
        char a[] = s.toCharArray();
        for(int i = 0; i< a.length; i++){
            if(a[i] == '0'){
                count++;
            }
            else{
                //s1 = s1.concat(Character.toString(a[i]));
                s1 = s1 + a[i];
            }
        }
        for(int j = 0 ; j<count; j++){
            //s1 = s1.concat(Character.toString('0'));
            s1 = s1 + '0';
        }
        System.out.println(s1);
    }
}
