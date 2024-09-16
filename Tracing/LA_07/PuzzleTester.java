package Tracing.LA_07;

public class PuzzleTester {
   public static void main(String[] args) {
      Puzzle p = new Puzzle(5, 8);
      Puzzle p1 = new Puzzle(8);
      p.methodA();
      System.out.println(p.methodB(7) + " " + p1.methodB(7));
   }
}

class Puzzle 
{
   public int x, z;

   public Puzzle(int x) {
      this.x = x;
   }

   public Puzzle(int x, int z) {
      this.x = x;
      this.z = z;
   }

   public void methodA() {
      z = x + methodB(x);
      System.out.println(x + " " + z);
      methodB(x, z);
   }

   public int methodB(int y) {
      x = y + x;
      System.out.println(x + " " + y);
      return x + 3;
   }

   public void methodB(int z, int x) {
      z = this.z + 1;
      x = x + 1;
      System.out.println(z + " " + x);
   }

}