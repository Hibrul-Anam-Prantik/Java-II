public class Book 
{
    public String title;
    public int price;
    public String author;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        if(title != null && author == null && price == 0) {
            System.out.println("Title: " + title);
        } else if(title != null && author != null && price == 0) {
            System.out.print("Title: " + title);
            System.out.println(", Author: " + author);
        } else if(title != null && author != null && price != 0) {
            System.out.print("Title: " + title);
            System.out.print(", Author: " + author);
            System.out.println(", Price: " + price);
        } else if(title != null && author == null && price != 0) {
            System.out.print("Title: " + title);
            // System.out.print(", Author: " + author);
            System.out.println(", Price: " + price);
        }
    }

    public void setDetails(int price) {
        this.price = price;
    }

    public void setDetails(String updateAuthor, int updatePrice) {
        author = updateAuthor;
        price = updatePrice;
    }
}
