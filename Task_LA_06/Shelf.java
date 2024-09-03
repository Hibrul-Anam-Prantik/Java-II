// TASK 02
public class Shelf 
{
     public int capacity;
     public int books;
     public void showDetails() {
          System.out.println("Shelf capacity: " + capacity);
          System.out.println("Number of books: " + this.books);
     }
     public void addBooks(int books) {
          if(capacity == 0) {
               System.out.println("Zero capacity. Cannot add books.");
          } else if(capacity >= (this.books + books)) {
               this.books += books;
               System.out.println(books + " books added to shelf");
          } else {
               System.out.println("Exceeds capacity");
          }
     }
}