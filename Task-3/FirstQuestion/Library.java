import java.util.Scanner;

public class Library {
    private final Books[] books;
    private int index=0;
    public Library(int numBooks)
    {
        this.books=new Books[numBooks];
    }


    public void intLibrary(int numBooks)  //Initializing with books in the library (Initial Values) depending upon the array length
    {
        int bookId;
        String author;
        String title;
        boolean isAvailable;
        if(index==numBooks)
        {
            System.out.println("Cannot add book. Library is full");
        }
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the bookId");
            bookId=sc.nextInt();
            if(bookId==0)  //bookId is zero only for the removed book
            {
                System.out.println("BookId cant be zero");
                bookId=sc.nextInt();
            }
            System.out.println("Enter the author name");
            author=sc.next();
            System.out.println("Enter title name");
            title=sc.next();
            Books book=new Books(bookId,author,title,true);
            books[index]=book;
            index++;
        }
    }
    public void searchBook(int id)
    {
        if(books.length==0)
        {
            System.out.println("No book is there. Library is empty");
        }
        else
        {
         for(int i=0;i<books.length;i++) {
             if (books[i].getBookId() == id) {
                 System.out.println("Given bookId is present in the library");
                 System.out.println("Book Id is "+books[i].getBookId());
                 System.out.println("Book author is "+books[i].getAuthor());
                 System.out.println("Book title is "+books[i].getTitle());
             }
         }
        }

    }

    public void dispBooks()
    {
            for(int i=0;i<books.length;i++) {

                    System.out.println("Book Id is "+books[i].getBookId());
                    System.out.println("Book author is "+books[i].getAuthor());
                    System.out.println("Book title is "+books[i].getTitle());
                    System.out.println("IsAvailable "+books[i].isAvailable());
                }
            }

    public void removeBook(int id){
        for(int i=0;i<books.length;i++)
        {
            if(books[i].getBookId()==id)
            {
                books[i]=new Books(); //initializing  with default values4
                System.out.println("Given book removed successfully");
                return;
            }
            System.out.println("Book is not present in the library");
        }

    }
     public void addBook()
     {
         int bookId;
         String author;
         String title;
         for(int i=0;i<books.length;i++)
         {
             if(books[i].getBookId()==0)
             {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter the bookId");
                 bookId=sc.nextInt();
                 if(bookId==0)  //bookId is zero only for the removed book
                 {
                     System.out.println("BookId cant be zero");
                     bookId=sc.nextInt();
                 }
                 System.out.println("Enter the author name");
                 author=sc.next();
                 System.out.println("Enter title name");
                 title=sc.next();
                 books[i].setBookId(bookId);
                 books[i].setAuthor(author);
                 books[i].setTitle(title);
                 books[i].setAvailable(true);
                 System.out.println("Book is added successfully");
                 return;
             }
         }
        System.out.println("Library is full.Cant add any book");
     }

    public static void main(String[] alibrgs)
    {
        int numBooks;
        int bookId;
        System.out.println("Enter the no of books that can be kept in the library");
        Scanner sc=new Scanner(System.in);
        numBooks=sc.nextInt();
        Library lib=new Library(numBooks);
        for(int i=0;i<numBooks;i++)
        {
            lib.intLibrary(numBooks);
        }
        System.out.println("Books entered successfully");
        System.out.println("Enter the bookId to search");
        bookId=sc.nextInt();
        lib.searchBook(bookId);
        System.out.println("Enter the bookId to remove");
        bookId=sc.nextInt();
        lib.removeBook(bookId);
        System.out.println("Books in the library are ");
         lib.dispBooks();
        System.out.println("Checking whether books can be still added in library");
        lib.addBook();
        lib.dispBooks();

    }

}
