package OOP;

public class Array2D {
    public static void main(String[] args) 
    {
        // int[][] arr = new int[3][3];
        ArrayPrinter ap = new ArrayPrinter();
        // System.out.println(ap.len1);
        // System.out.println(ap.len2);
        // System.out.println(ap.len3);
        // ap.print2D(arr);
        // System.out.println(ap.len1);
        // System.out.println(ap.len2);
        // System.out.println(ap.len3);
        ArrayMaker am = new ArrayMaker();
        // am.makeArr1D();
        // int [] arr1 = am.arr1D;
        // ap.print1D(arr1);
        am.makeArr2D();
        int[][] arr2 = am.arr2D;
        ap.print2D(arr2);
    }
}
