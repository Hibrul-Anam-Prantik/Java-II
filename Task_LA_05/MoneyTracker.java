package Task_LA_05;

public class MoneyTracker 
{
    public String name;
    public double balance;
    public double inc;    // income
    public double exp;    // expence
    public String info()
    {
        return "Name: " + name +"\nCurrent Balance: " + balance;
    }
    public void createTracker(String name) 
    {
        this.name = name;
        balance = 1.0;
    }
    public void income(double inc)
    {
        this.inc = inc;
        balance += inc;
        System.out.println("Balance Updated!");
    }
    public void expense(double exp)
    {
        if ( balance < exp ) {
            System.out.println("Not enough balance.");
        } else if ( (balance - exp) == 0) {
            balance -= exp;
            System.out.println("You're broke!");    
        } else {
            balance -= exp;
            System.out.println("Balance updated.");
            this.exp = exp;
        }
    }
    public void showHistory()
    {
        System.out.println("Last added: " + inc);
        System.out.println("Last spent: " + exp);
    }
}
