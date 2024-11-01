public class Books {

    private int bookId;
    private String author;
    private String title;
    private boolean isAvailable;

   public Books(){
   }
    public Books(int bookId,String author,String title,boolean isAvailable)
    {
        this.bookId=bookId;
        this.author=author;
        this.title=title;
        this.isAvailable=isAvailable;
    }
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }



}
