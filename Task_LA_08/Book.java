package Task_LA_08;

public class Book
{
    public static int total_books_sold;
    public static double total_revenue;
    public String title;
    private double discountPrice;

    public Book(String title, double discount)
    {
        this.title = title;
        calcDiscountPrice(discount);
        total_books_sold ++;
        total_revenue += discountPrice;
    }

    public void calcDiscountPrice(double discount)
    {
        double basePrice = 150;
        double percent = discount/100;
        discountPrice = basePrice - (basePrice * percent);
    }

    public void bookDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Price after Discount: \n" + discountPrice + " TK");
    }
}

