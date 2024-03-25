package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        //Create a new array to hold the first d elements
        int[] removedElements = Arrays.copyOfRange(arr, 0,d);
        //Create a new array to hold the remaining elements
        int[] remainingElements = Arrays.copyOfRange(arr,d,arr.length);
        //Concatenate the two new arrays
        int[] newArray = new int[remainingElements.length + removedElements.length];
        System.arraycopy(remainingElements,0,newArray,0,remainingElements.length);
        System.arraycopy(removedElements,0,newArray,remainingElements.length,removedElements.length);

        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
