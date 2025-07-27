package com.jmendez.algorithms.sorting;


/*
* Efficient algorithm for sorting a small number of elements
*  */
public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 9, 1, 5, 6};
        System.out.println("Before Insertion Sort:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        insertionSort(nums);

        System.out.println("\nAfter Insertion Sort:");

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

    public static void insertionSort(int[] nums ){

        for(int i = 1; i < nums.length; i ++){
            // Current Array's Element
            int key = nums[i];

            // Initialize j at the previous current element's position
            int j = i - 1;

            // Move elements of nums[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && nums[j] > key) {
                // Shift the element to the right
                nums[j + 1] = nums[j];
                j--;
            }
            // Place the key at its correct position
            nums[j + 1] = key;
        }
    }
}
