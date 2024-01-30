package com.vsk.practice.controlflow_statements;

public class ForLoopPrimeNumbers {
    public static void main(String[] args){
        int count =0;
        for(int x=1; x<20; x++){
            if(isPrime(x)){
                count++;
                System.out.println(x);
                if(count==10){
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if (n==0){
            return false;
        }

        for(int i = 2; i<= n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
