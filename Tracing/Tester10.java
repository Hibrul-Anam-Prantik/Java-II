package Tracing;

public class Tester10 {
    public static void main(String[] args) {
        Human0 h1 = new Human0();
        Human0 h2 = new Human0();
        h1.age = 21;
        h1.height = 5.5;
        System.out.println(h1.age);
        System.out.println(h1.height);
        h2.height = h1.height - 3;
        System.out.println(h2.height);
        h2.age = h1.age++;
        System.out.println(h1.age);
        h2 = h1;
        System.out.println(h2.age);
        System.out.println(h2.height);
        h2.age++;
        h2.height++;
        System.out.println(h1.age);
        System.out.println(h1.height);
        h1.age = ++h2.age;
        System.out.println(h2.age);
        System.out.println(h2.height);}}
class Human0 {
    public int age;
    public double height;
}
