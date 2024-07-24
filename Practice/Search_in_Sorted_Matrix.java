package Practice;

import java.util.Scanner;

import OOP.ArrayPrinter;

public class Search_in_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] matrix = { {10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50} };
        ArrayPrinter ap = new ArrayPrinter();
        ap.print2D(matrix);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int key = sc.nextInt();
        stairCaseSearch(matrix, key);
        sc.close();
    }

    public static void stairCaseSearch(int[][] matrix, int key)
    {
        int row = 0, col = matrix[0].length - 1;
        boolean found = false;
        while ( row < matrix.length && col >= 0 )
        {
            if (matrix[row][col] == key ) {
                System.out.println("\"" + key + "\" found at (" + (row + 1) +", " + (col + 1) + ").");
                found = true;
                break;
            } else if ( key < matrix[row][col] ) {
                col -- ;
            } else {   // if ( key > matrix[row][col] ) {
                row ++;
            } 
        }
        if (!found) {
            System.out.println("\"" + key + "\" not found.");
        }
    }
}