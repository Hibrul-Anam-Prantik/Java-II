package OOP;

public class Tester {
    public static void main(String[] args) {
        ArrayMaker am = new ArrayMaker();
        ArrayPrinter ap = new ArrayPrinter();
        am.makeArr2D();
        int[][] arr;
        arr = am.arr2D;
        ap.print2D(arr);
    }
}