package Practice;

import OOP.ArrayPrinter;

/*
        |1 | |2 | |3 | |4 |

        |5 | |6 | |7 | |8 |
        
        |9 | |10| |11| |12|

        |13| |14| |15| |16|
        Have to print "1 | 2 | 3 | 4 | 8 | 12 | 16 | 15 | 14 | 13 | 9 | 5 | 6 | 7 | 11 | 10 "
 */

public class SpiralMatrix_Array {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16},{17,18,19,20}};
        SpiralPrinter sp = new SpiralPrinter();
        ArrayPrinter ap = new ArrayPrinter();
        ap.print2D(matrix);
        sp.printSpiral(matrix);
    }
}

class SpiralPrinter {
    public int[][] matrix;

    void printSpiral(int[][] matrix)
    {
        this.matrix = matrix;
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        while(startRow <= endRow && startCol <= endCol) 
        {
            // top
            for (int i = startCol; i <= endCol; i++) 
            {
                System.out.print(matrix[startRow][i] + " ");
            }
            // right
            for(int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int i = endCol - 1; i >= startCol; i--) 
            {
                if (startCol == endCol) {
                    break;   // already printed in top
                }
                System.out.print(matrix[endRow][i] + " ");
            }
            // left
            for(int i = endRow - 1; i > startRow; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow ++;
            startCol ++;
            endRow --;
            endCol --;
        }
    }
}
