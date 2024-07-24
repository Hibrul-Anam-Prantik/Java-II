package OOP;

import java.util.*;

public class Array_Sorting {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 4 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        bubbleSort(arr);
        int[] arr1 = { 3, 1, 5, 2, 4 };
        System.out.println("Original Array: " + Arrays.toString(arr1));
        selectionSort(arr1);
    }

    public static void bubbleSort(int arr[]) {
        // bubble sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr) + "(Bubble Sort)");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr) + "(Selection Sort)");
    }
}
