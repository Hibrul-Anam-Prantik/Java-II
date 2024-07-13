package Task_LA_05;

// TASK 7
public class Reader 
{
    public String name = "New user";
    public int capacity;     // capacity to read, initial 0
    public String[] books;
    public int iR;    // index of reader
    public void createReader(String name, int capa)
    {
        this.name = name;
        capacity = capa;
        books = new String[capa];
        iR = 0;
    }
    public void readerInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books:");
        if (iR == 0) {
            System.out.println("No books added yet");
        } else {
            for (int i = 0; i < iR; i++)
            {
                System.out.println("Book " + (i+1) +": " + books[i]); 
            }
        }
    }
    public void addBook(String book)
    {
        if (iR < capacity) {
            books[iR++] = book;
        } else {
            System.out.println("No more space for new book");
        }
    }
    public void increaseCapacity(int iCapa)    // iCapa = increased capacity
    {
        capacity = iCapa;
        String[] nBooks = new String[iCapa];    // new array for books 
        for ( int i = 0; i < iR; i++)
        {
            nBooks[i] = books[i];      // entering previous books
        }
        books = nBooks;     // replacing the initial array
        System.out.println(name + "\'s capacity increased to " + iCapa);
    }
}

