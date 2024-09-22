package Task_LA_08;

// TASK 04
public class Borrower
{
    public static int[] book_count = {3, 3, 3}; // copies of the books
    public static String[] book_name = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    // Your Code here
    public String name;
    public String[] borrowedBooks;
    public int maxBooks = 9;  // 9 books available in total
    private int borrowedBooksIndex;  // using it to borrow books, by index manipulating
    public int borrowedBooksCount;   // using it as index, to print the borrowed books

    public Borrower(String name)
    {
        this.name = name;
        borrowedBooks = new String[maxBooks];
    }

    public static void bookStatus()
    {
        System.out.println("Available Books: ");
        for(int i = 0; i < book_name.length; i++)
        {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }

    public void borrowBook(String book)
    {
        for(int i = 0; i < book_name.length; i++)
        {
            if (book.equals(book_name[i])) {
                if(book_count[i] > 0) {
                    borrowedBooks[borrowedBooksIndex++] = book;
                    borrowedBooksCount++;
                    book_count[i] -= 1;
                } else {
                    System.out.println("This book is not available.");
                    break;
                }
            }
        }
    }

    public void borrowerDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Books Borrowed: ");
        for(int i = 0; i < borrowedBooksCount; i++)
        {
            System.out.println(borrowedBooks[i]);
        }
    }

    public static int remainingBooks(String book)
    {
        int index = 0;  // to ge the index, where the book is stored
        for(int i = 0; i < book_name.length; i++)
        {
            if(book_name[i].equals(book)) {
                index = i;   // choosing the book
                break;
            }
        }
        return book_count[index];
    }
}
