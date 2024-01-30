package com.vsk.practice.JIL_3;

public class question_3_11 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("IamSagaorooiooo");
        char c = 'o';

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == c){
                str.deleteCharAt(i);
                break;
            }
        }
        System.out.println(str);
    }
}
