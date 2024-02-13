package com.vsk.practice.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public static List<List<Integer>> findTriplets(int[] arr, int targetSum) {
        List<List<Integer>> triplets = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == targetSum) {
                    // Found a triplet that sums to the target
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[left]);
                    triplet.add(arr[right]);
                    triplets.add(triplet);

                    // Move both pointers towards the center
                    left++;
                    right--;
                } else if (currentSum < targetSum) {
                    // Current sum is less than the target, move left pointer to increase the sum
                    left++;
                } else {
                    // Current sum is greater than the target, move right pointer to decrease the sum
                    right--;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 2, 1, 5, 2, 3};
        int targetSum = 3;

        List<List<Integer>> triplets = findTriplets(arr, targetSum);

        if (triplets.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            System.out.println("Triplets that sum to " + targetSum + ":");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
        }
    }
}
