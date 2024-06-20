package com.vsk.practice.miscellaneous.JIL.JIL_3;

public class question_3_12 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("IamPhoenixoooza");
        char c = 'a';

        for(int i = str.length()-1; i>0 ; i++){
            if(str.charAt(i) == c){
                str.deleteCharAt(i);
                break;
            }
        }
        System.out.println(str);
    }
}
