package com.adepuu.exercises.session5;

public class Exercise1 {
    public static void main(String[] args) {

        int[] array1 = { 7, 2, 5, 1, 4 };
        System.out.println("The highest number in the array is: " + findHighestInt(array1));
    }

    //Method to find the highest int in the array
    public static int findHighestInt(int[] arrayNumbers) {
        int maxInt = arrayNumbers[0];
        for (int number : arrayNumbers) {
            if (number > maxInt) {
                maxInt = number;
            }
        }
        return maxInt;
    }
}
