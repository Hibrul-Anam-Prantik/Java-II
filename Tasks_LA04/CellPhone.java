package Tasks_LA04;

public class CellPhone {
    public String model = "unknown";
    public String[] arr;
    void printDetails()
    {
        System.out.println("Phone Model "+model);
        System.out.println("Length of Array: "+arr.length);
    }
    void storeContact(String str)
    {
        System.out.println("Contact Stored");
    }
}
