package Tasks_LA04;

public class Tester9{
    public static void main(String[]args){
       CellPhone phone1 = new CellPhone();
       phone1.printDetails();
       phone1.model ="Nokia 1100";
       System.out.println("1##################");
       phone1.storeContact("Joy - 01834");
       phone1.printDetails();
       System.out.println("2##################");
       phone1.storeContact("Toya - 01334");
       phone1.storeContact("Aayan - 01135");
       phone1.printDetails();
       System.out.println("3##################");
       phone1.storeContact("Sani - 01441");
       phone1.printDetails();  
    }
  }
// class CellPhone {
//     public String model = "unknown";
//     public String[] arr;
//     void printDetails()
//     {
//         System.out.println("Phone Model "+model);
//         System.out.println("Length of Array: "+arr.length);
//     }
//     void storeContact(String str)
//     {
//         System.out.println("Contact Stored");
//     }
// }