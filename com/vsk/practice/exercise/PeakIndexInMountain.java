package com.vsk.practice.exercise;

public class PeakIndexInMountain {
        public static void main(String[] args) {
            System.out.println(peakIndexInMountainArray(new int[]{1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 0}));
        }
        public static int peakIndexInMountainArray(int[] arr) {
            int low = 0;
            int high = arr.length - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else if (arr[mid] > arr[mid + 1]) {
                    high = mid;
                }
            }

            return low;
        }
}
