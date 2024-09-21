package Task_LA_08;

public class BookTester
{
    public static void main(String[] args) {
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: "+Book.total_revenue + " TK");
        System.out.println("==========1==========");
        Book b1 = new Book("Java Programming", 10); // 10% discount
        b1.bookDetails();
        System.out.println("==========2==========");
        Book b2 = new Book("Python Programming", 15); // 15% discount
        b2.bookDetails();
        System.out.println("==========3==========");
        Book b3 = new Book("Data Structures", 5); // 5% discount
        b3.bookDetails();
        System.out.println("==========4==========");
        System.out.println("Total Books Sold: " + Book.total_books_sold);
        System.out.println("Total Revenue: "+Book.total_revenue + " TK");
    }
}

class Book
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
