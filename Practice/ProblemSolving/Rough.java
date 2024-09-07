package Practice.ProblemSolving;
import java.util.*;
public class Rough {
    public static void main(String[] args) {
        int[][] a = {{1,2}, {3,4}, {2,3}, {3,0}};
        for(int i = 0; i < 2; i ++) {
            for(int j = 0; j < 4; j ++) {
                System.out.print(a[j][i] + "  ");
            }
            System.out.println();
        }
        // System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        System.out.println(a[0].length);
    }
}
class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char c1 = coordinate1.charAt(0); // letter
        char c2 = coordinate1.charAt(1); // int
        int n1 = c1 - 'a' + 1;
        int n2 = c2 - '0';
        String color1 = "", color2 = "";
        if ((n1 + n2) % 2 == 0) {
            color1 = "Black";
        } else {
            color1 = "White";
        }
        c1 = coordinate2.charAt(0);
        c2 = coordinate2.charAt(1);
        n1 = c1 - 'a' + 1;
        n2 = c2 - '0';
        if ((n1 + n2) % 2 == 0) {
            color2 = "Black";
        } else {
            color2 = "White";
        }
        return color1.equals(color2);
    }
}