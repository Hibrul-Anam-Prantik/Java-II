public class Product 
{
  private String name;
  private double price;
  private int quantity;

  public Product() {
    name = "Unknown";
    price = 0.0;
  }

  public void displayInfo() {
    System.out.println("Product Name: " + name);
    System.out.print("Price: $" + price);
  }

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public void setQuantity(int n) {
    quantity = n;
  }

  public void displayInfo(boolean b) {
    System.out.println("Product Name: " + name);
    System.out.println("Price: $" + price);
    System.out.println("Quantity: " + quantity);
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }
}