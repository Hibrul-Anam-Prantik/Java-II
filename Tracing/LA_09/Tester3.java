package Tracing.LA_09;

public class Tester3
{
    public static void main(String args[]){
        Quiz3A a1 = new Quiz3A();
        a1.methodB(1,2);
        Quiz3A a2 = new Quiz3A(3);
        a2.methodB(2,4);
        a1.methodB(2,1);
    }
}

class Quiz3A{
    public static int temp = 4;
    public static int y;
    public int sum;
    public Quiz3A(){
        int y = 7;
        y = temp - 1;
        sum = Quiz3A.temp + 1 + y;
        temp+=2;
    }
    public Quiz3A(int k){
        temp = temp++;
        sum = ++temp + k;
        Quiz3A.y = (sum++) - 1;
        System.out.println(Quiz3A.y+" "+temp+" "+y);
    }
    public int methodB(int m, int n){
        int x = 0;
        y = this.y + m + (++temp);
        x = x + 2 +  n;
        sum = sum + x + y;
        System.out.println(x + " " + this.y+ " " + sum);
        return sum;
    }
}


