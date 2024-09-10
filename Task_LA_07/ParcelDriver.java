public class ParcelDriver {
    public static void main(String[] args){
       Parcel p1 = new Parcel();
       p1.printDetails();
       p1.name = "Spongebob";
       p1.printDetails();
       System.out.println("1**************");
       Parcel p2 = new Parcel("Bob the Builder");
       p2.weight = 15;
       p2.calcFee("Gulshan");
       p2.printDetails();
       System.out.println("2**************");
       p2.addWeight(25);
       p2.calcFee("Banani");        
  p2.printDetails();
       System.out.println("3**************");
       Parcel p3 = new Parcel("Dora the Explorer", 10);
       p3.addWeight(15);
       p3.calcFee("Dhanmondi");
       p3.printDetails();
    }
 }

//  class Parcel 
//  {
//     public String name;
//     public int weight;
//     public double total_fee;
//     public int location_charge;

//     public Parcel() {

//     }

//     public Parcel(String name) {
//         this.name = name;
//     }

//     public Parcel(String name, int weight) {
//         this.name = name;
//         this.weight = weight;
//     }

//     public void printDetails() {
//         if(name == null) {
//             System.out.println("Set name first");
//         } else {
//             System.out.println("Name: " + name);
//             System.out.println("Total Weight: " + weight);
//             System.out.println("Total Fee: " + total_fee);
//         }
//     }

//     public void calcFee(String location) {
//         if(location.equals("Dhanmondi")) {
//             location_charge = 50;
//         } 
//         if(weight == 0) {
//             total_fee = 0;
//         } else {
//             total_fee = (weight * 20) + location_charge;
//         }
//     }

//     public void addWeight(int add) {
//         weight += add;
//         System.out.println("Updated Weight: " + weight);
//     }
//  }
