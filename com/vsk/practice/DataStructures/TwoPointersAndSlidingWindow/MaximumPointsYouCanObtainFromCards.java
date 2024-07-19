package com.vsk.practice.DataStructures.TwoPointersAndSlidingWindow;

/**
 * created by : v1dya-sagar on 19-07-2024
 *
 * @author : v1dya-sagar
 * @date : 19-07-2024
 * @project : JavaPractice
 */
public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0, maxSum = 0;
        for(int i = 0; i < k; i++){
            leftSum += cardPoints[i];
        }
        maxSum = leftSum;

        int rightIndex = cardPoints.length - 1;
        for(int j = k - 1; j >= 0; j--){
            rightSum += cardPoints[rightIndex];
            rightIndex--;
            leftSum -= cardPoints[j];

            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }
}
