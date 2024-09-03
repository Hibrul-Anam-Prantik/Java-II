// import java.util.*;

public class Cart {
    public int cNum;    // cart number
    public String[] item = new String[3];
    public double[] price = new double[3];
    public int iI;    // index of items
    public int iP;    // index of prices
    public double discount;
    public void create_cart(int cNum)
    {
        this.cNum = cNum;   // cart number
        iI = 0;    // index of items
        iP = 0;    // index of prices
    }
    public void addItem(String item, double price)
    {
        if(iI < 3 && iP < 3) {
            this.item[iI++] = item;
            System.out.println(item + " added to cart " + cNum + ".");
            System.out.println("You have " + iI + " item(s) in your cart now.");
            this.price[iP++] = price;
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void cartDetails()
    {
        double sum = 0;
        System.out.println("Your cart(c" + cNum + ") :");
        for (int i = 0; i < iI; i++) {
            System.out.println(item[i] + " - " + price[i]);
            sum += price[i];
        }
        System.out.println("Discount Applied: " + discount + "%");
        if (discount != 0) {
            double x = sum * (discount/100);   // x = discounted ammount, that is to be deducted from sum;
            sum -= x;
        }
        System.out.println("Total price: " + sum);
    }
    public void giveDiscount(double discount)
    {
        this.discount = discount;
    }
}
