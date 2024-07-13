package Task_LA_05;

public class Employee 
{
    public String name;
    public double salary;
    public String designation;
    public void newEmployee(String name) 
    {
        this.name = name;
        salary = 30000;
        designation = "junior";
    }
    public void displayInfo()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary + " Tk");
        System.out.println("Employee Designation: " + designation);
    }
    public void calculateTax()
    {
        double tax;
        if ( salary > 50000) {
            tax = salary * 0.3;
            System.out.println(name + " Tax Amount: " + tax + " Tk");
        } else if ( salary < 50000 && salary > 30000) {
            tax = salary * 0.1;
            System.out.println(name + " Tax Amount: " + tax + " Tk");
        } else {
            System.out.println("No need to pay tax");
        }
    }
    public void promoteEmployee(String designation)
    {
        this.designation = designation;
        if (designation.equals("senior")) {
            salary += 25000;
        }
        if (designation.equals("lead")) {
            salary += 50000;
        }
        if (designation.equals("manager")) {
            salary += 75000;
        }
        System.out.println(name + " has been promoted to " + designation);
        System.out.println("New Salary: " + salary + " Tk");
    }
}
