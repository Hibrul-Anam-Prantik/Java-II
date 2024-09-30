package OOP.AbstractClass.TypeCasting;

public class NonPrimitive
{
    public static void main(String[] args) {
        // Up Casting > Keeping an object of subclass(Student) into Super class(Person class)
        Person p = new Student();
        p.print();

        Student s = (Student)p;
        s.print();

        Person p2 = (Person) s;
        p2.print();

        Student st = new Student();
        Person per = (Person) st;
        per.print();

        Object str = "DX";
        String realStr = (String) str;
        System.out.println(realStr);
        System.out.println(str.equals(realStr));

        // Down Casting
        Student stu = (Student) new Person();  // While running, it will show exception
        stu.print();
/*
    Java Doesn't allow that-
        Student stu = new Person(); // we can't write this , but
        // we can write this
        Student stu = (Student) new Person();
 */
    }
}
