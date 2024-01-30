package com.vsk.practice.prepinsta.gettingStarted;

public class PrimeNumberWithingGivenRange {
    public static void main(String[] args) {
        int low = 5 , high = 15;
        for(int i = low ; i <= high; i++){
            boolean isPrime = true;
            if(i < 2){
                isPrime = false;
            } else {
                for(int j = 2 ; j < i/2 ; j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(i + " Is Prime");
            } else {
                System.out.println(i + " Not Prime");
            }
        }
    }
}
