package OOP;

import java.util.*;

public class TesterCat 
{
    public static void main(String[] args) 
    {
        AP ap = new AP();
        String[][] arr = new String[3][3];
        for(int i = 0; i <3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                arr[i][j] = "X";
            }
        }
        ap.p2D(arr);
    }    
}

class AP {
    public String[][] ars;
    public void p2D(String[][] arr) 
    {
        ars = arr;
        System.out.println("2-D Array:");
        for ( int i = 0; i < ars[0].length; i++)
        {
            for(int j = 0; j < ars.length; j++)
            {
                if (j == 0) {
                    System.out.print("  |");
                }
                System.out.print(ars[i][j] + "|");
            }
            System.out.println();
        }
    //    System.out.println();
    }
}