package com.vsk.practice.exercise.LeetCodeDaily;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] cus) {
        int ct = cus[0][0];
        double ans = 0;
        for(int i = 0; i < cus.length; i++){
            if(ct<cus[i][0]){
                ct=cus[i][0];
            }
            ct+=cus[i][1];
            ans+=ct-cus[i][0];
        }
        return ans/cus.length;
    }
}
