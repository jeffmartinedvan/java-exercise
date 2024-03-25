package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    public static void main(String[] args) {
        int[] arr1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] arr2 = {30, 40, 50, 60};
        int[] arr3 = {30, 60, 90};

        System.out.println(Arrays.toString(daysToHigherTemperature(arr1)));
        System.out.println(Arrays.toString(daysToHigherTemperature(arr2)));
        System.out.println(Arrays.toString(daysToHigherTemperature(arr3)));
    }

    public static int[] daysToHigherTemperature(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int daysCount = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    daysCount = j - i;
                    break;
                }
            }
            result[i] = daysCount;
        }
        return result;
    }
}
