package Practice.ProblemSolving;
import java.util.*;
public class Rough {
    public static void main(String[] args) {  
        int x = -10;
        String s = "" + x;
        System.out.println(s);
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