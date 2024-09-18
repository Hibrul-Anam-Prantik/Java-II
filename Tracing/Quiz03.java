package Tracing;

public class Quiz03 {
    public static void main(String[] args) {
        Tracing t1 = new Tracing(4, 3);
        Tracing t2 = new Tracing(3, 2);
        t1.methodB(t2, 5);
    }
}

class Tracing 
{
    static int x = 1;
    public int a, b;

    Tracing(int a, int b) {
        this.a = b;
        this.b = a;
    }

    int methodA(int a) {
        this.a = x + a;
        this.b = this.b + this.a;
        System.out.println(this.a + " " + this.b + " " + x);
        return a;
    }

    void methodB(Tracing t1, int x) {
        t1.b = t1.methodA(t1.a) - t1.b +this.b - methodA(a);
        System.out.println(t1.a + " " + t1.b + " " + x);
    }
}
