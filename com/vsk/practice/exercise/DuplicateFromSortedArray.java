package com.vsk.practice.exercise;

public class DuplicateFromSortedArray {
    public static void main(String[] args) {

        char[] a = {'1','2','1','3','1','1','3','4','5'};
        char[] a1 = new char[a.length];
        int count = 0,index =0;
        for(int i = 0 ; i < a.length; i++){
            if(!InArray(a1,a[i])){
                for(int x = i+1; x < a.length; x++){
                    if(a[i] == a[x]){
                        count++;
                    }
                }
                a1[index] = a[i];
                index++;
            }
        }
        for(int z = 0; z<count; z++){
            a1[index] = '_';
            index++;
        }
        System.out.println(a1);
    }
    public static boolean InArray(char[] b,char n){
        for(int j = 0 ; j < b.length; j++){
            if(b[j] == n){
                return true;
            }
        }
        return false;
    }
}
