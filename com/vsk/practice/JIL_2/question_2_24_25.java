package com.vsk.practice.JIL_2;

public class question_2_24_25 {
    public static void main(String[] args) {
        char[] a = {'a' , 'A' , 'b' , 'B'};
        for(int i = 0 ; i< a.length; i++){
            if(a[i] >= 65 && a[i] <= 90){
                System.out.println("upper case : " + a[i]);
            } else if (a[i] >= 97 && a[i] <= 122 ) {
                System.out.println("lower case : " + a[i]);
            }
        }
    }
}
