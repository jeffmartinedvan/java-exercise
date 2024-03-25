package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 1};
        int numberToRemove = 1;
        List<Integer> list = removeFromArray(arr, numberToRemove);
        System.out.println("List after removing " + numberToRemove + ": ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> removeFromArray(int[] arr, int arrayToRemove) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != arrayToRemove) {
                list.add(num);
            }
        }
        return list;
    }
}
