public class Book {
    public String title;
    public String author;
    public String ISBN;
    public boolean isAvailable;



    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
