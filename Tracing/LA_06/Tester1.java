package Tracing.LA_06;

public class Tester1{
   public static void main (String args[]){
     Test1 t1 = new Test1();
     t1.methodB(5,-8);
     Test1 t2 = new Test1();
     t2.methodA();
   }
 }
 class Test1{
   public int sum;
   public int y;
   public void methodA(){
     int x=2, y =3;
     int [] msg ={3, 7};
     y = this.y + msg[0];
     methodB(msg[1]++, msg[0]);
     x = x + this.y + msg[1];
     sum = x + y + msg[0];
     System.out.println(x + " " + y+ " " + sum);
   }
   public void methodB(int mg2, int mg1){
     int x = 0;
     y = this.y + mg2;
     x = x + 19 + mg1;
     sum = this.sum + x + y;
     mg2 = y + mg1;
     mg1 = mg2 + x + 2;
     System.out.println(x + " " + y+ " " + sum);
   }
 }
 
 

class Test2 {
   int x = 3, y = 1, z = -4;
   double p = 2.5;
   public void methodA(int n, int x) {
       this.x = methodB(x, n);
       p = this.x + n % x * 2.0;
       y = (z++) + methodB(z, (int) p) + (++z);
       System.out.println(this.x + " " + (n + y) + " " + (x + z)) ;
   }
   public int methodB(int q, int n) {
       int arr[] = {2, -5, 6};
       arr[0] = arr[2] - this.x + n;
       arr[1] = q - arr[1];
       arr[2] = arr[q % 3] + arr[n % 2];
       System.out.println(arr[0] + " " + arr[1] + " " + arr[2]) ;
       return arr[1] + arr[2] - arr[0];
   }
}

