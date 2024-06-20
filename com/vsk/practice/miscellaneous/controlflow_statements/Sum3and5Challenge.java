package com.vsk.practice.miscellaneous.controlflow_statements;

public class Sum3and5Challenge {
    public static void main(String[] args){
        int sum = 0,count = 0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0) {
                count += 1;
                sum+=i;
                System.out.println("Number = " +i);
            }
                if(count>=5){
                    break;
                }
            }
        System.out.println("sum" + sum);
        }

    }

