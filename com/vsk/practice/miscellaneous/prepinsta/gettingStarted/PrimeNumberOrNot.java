package com.vsk.practice.miscellaneous.prepinsta.gettingStarted;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int num = 9;
        boolean isPrime = true;
        if(num < 2){
            isPrime = false;
        } else {
            for(int i = 2 ; i < num/2 ; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println("Is Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
