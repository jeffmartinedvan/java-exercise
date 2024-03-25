package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static int[] removeDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (!list.contains(num)){
                list.add(num);
            }
        }
        //Convert list back to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 3, 3, 4, 5};
        int[] result = removeDuplicates(array1);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
