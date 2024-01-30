package com.vsk.practice.JIL_1_2;

public class question__11 {
    public static void main(String[] args) {
        int a = 1;
        while(a<=100){
            if(a%2 == 0){
                System.out.println(a);
            }
            a++;
        }
        for(int i = 1;i <=100 ;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        int b = 1;
        do{
            if(b%2 == 0){
                System.out.println(b);
            }
            b++;
        }while (b<=100);
    }
}
