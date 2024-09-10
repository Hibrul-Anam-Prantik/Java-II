public class ProductTester{
    public static void main(String[] args) {
      System.out.println("< —--—----1—-------->");
      Product product1 = new Product();
      product1.displayInfo();
      System.out.println();
      System.out.println("< —--—----2—-------->");
      Product product2 = new Product("Laptop", 1200.00);
      product2.setQuantity(10);
      product2.displayInfo(true); 
      System.out.println("< —--—----3—-------->");
      System.out.println("Retrieved Price: $" + product2.getPrice());
      System.out.println("Retrieved Quantity: " + product2.getQuantity());
        }
  }

  // class Product
  // {
  //   private String name;
  //   private double price;
  //   private int quantity;

  //   public Product() {
  //     name = "Unknown";
  //     price = 0.0;
  //   }

  //   public void displayInfo() {
  //     System.out.println("Product Name: " + name);
  //     System.out.println("Price: $" + price);
  //   }

  //   public Product(String name, double price) {
  //     this.name = name;
  //     this.price = price;
  //   }

  //   public void setQuantity(int n) {
  //     quantity = n;
  //   }

  //   public void displayInfo(boolean b) {
  //     System.out.println("Product Name: " + name);
  //     System.out.println("Price: $" + price);
  //     System.out.println("Quantity: " + quantity);
  //   }

  //   public double getPrice() {
  //     return price;
  //   }

  //   public int getQuantity() {
  //     return quantity;
  //   }
  // }
  