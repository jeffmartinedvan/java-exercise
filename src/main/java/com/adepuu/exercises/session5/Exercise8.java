package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     * <p>
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     * <p>
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     * <p>
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] arr2 = {1, 1, 2};
        int[] arr3 = {1};
        System.out.print("Duplicate arrays: ");
        findDuplicates(arr1);
        System.out.println();
        System.out.print("Duplicate arrays: ");
        findDuplicates(arr2);
        System.out.println();
        System.out.print("Duplicate arrays: ");
        findDuplicates(arr3);
    }

    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}