package Tracing.LA_05;

public class Tester11 {
    public static void main(String [] args){
        Task11 t1 = new Task11();
        t1.methodA(5);
        t1.methodA(3);
    }
 }
 
  class Task11 {
     int temp = 4;
     int sum;
     int y;
     int x;
     void methodA(int m){
        int [] n = {2,5};
        int x = 0;
        y = y + m + this.methodB(x,m)+(temp++)+y;
        x = this.x + 2 + (++n[0]);
        sum = sum + x + y;
        n[0] = sum + 2;
        System.out.println(n[0] + x + " " + y+ " " + sum);
        }
     int methodB(int m, int n){
        int [] y = {1};
        this.y = y[0] + this.y + m;
        x = this.y + 2 + temp - n;
        sum = x + y[0] + this.sum;
        System.out.println(y[0]+ x + " " + y[0] + " " +sum);
        return y[0];
    }
 }
