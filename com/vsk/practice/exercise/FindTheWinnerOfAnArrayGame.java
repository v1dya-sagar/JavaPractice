package com.vsk.practice.exercise;

/**
 * created by : v1dya-sagar on 13-07-2024
 *
 * @author : v1dya-sagar
 * @date : 13-07-2024
 * @project : JavaPractice
 */
public class FindTheWinnerOfAnArrayGame {
    public int getWinner(int[] arr, int k) {
        int thresh = 0, winner = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > winner){
                winner = arr[i];
                thresh = 0;
            }
            if(++thresh == k){
                break;
            }
        }
        return winner;
    }
}
