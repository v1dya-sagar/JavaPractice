package com.vsk.practice.exercise;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[]arr={21,51,41,31,11};
        int k=3;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for (int j=0;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    count++;
                }
            }
            if((arr.length-count)==k){
                System.out.println(arr[i]);
                break;
            }
        }
//

    }
}
