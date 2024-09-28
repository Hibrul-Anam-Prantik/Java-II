package Task_LA_09.Task07;

public class AccountTester
{
    public static void main(String[] args) {
        System.out.println("Total account holders: " + Account.count);
        System.out.println("1================");
        Account p1 = new Account("Abdul",45,"Service Holder",500000);
        p1.addMoney(300000);
        p1.printDetails();
        System.out.println("2================");
        Account p2 = new Account("Rahim",55,"Businessman",700000);
        p2.withdrawMoney(700000);
        p2.printDetails();
        System.out.println("3================");
        Account p3 = new Account("Ashraf",62,"Govt.Officer",200000);
        p3.withdrawMoney(250000);
        p3.printDetails();
        System.out.println("4================");
        System.out.println("Total account holders: " + Account.count);
    }
}

class Account
{
    static int count = 0;
    String name;
    int age;
    String occupation;
    int total;

    Account(String name, int age, String occupation, int total) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.total = total;
        count += 1;
    }

    void addMoney(int add) {total += add;}

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Total Amount: " + total);
    }

    void withdrawMoney(int withdraw) {
        if(total < withdraw) System.out.println("Insufficient money for withdrawal!");
        else total -= withdraw;
    }
}

