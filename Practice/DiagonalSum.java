package Practice;

public class DiagonalSum {
    public static void main(String[] args)
    {    
        int[][] matrix = {{1, 2, 3, 4}, 
                          {5, 6, 7, 8}, 
                          {9, 10, 11, 12}, 
                          {13, 14, 15, 16},
                          {17, 18, 19, 20}};
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if(i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println(sum);
        int startRow = 0;
    //    int startCol = 0;
    //    int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;
        sum = 0;
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if( (i == startRow && j == endCol) ) {
                    sum += matrix[i][j];
                }
            }
            endCol--;
        //    endRow--;
        //    startCol++;
            startRow++;
        }
        System.out.println(sum);
    }                    
}
