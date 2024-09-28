package Practice;

public class GetSet

{
    public static void main(String[] args) {
        A a = new A();
//        a.num = 10;
        a.setNum(10);
        System.out.println(a.getNum());
        a.setName("Getter-Setter");
        System.out.println(a.getName());
    }
}


class A {
    private int num = 10;
    private String name = "XX";

    void setNum(int x) {
        num = x;
    }

    int getNum() {
        return num;
    }
    void setName(String name) {this.name = name;}
    String getName() {return name;}
}
