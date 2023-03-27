package Lab03;

public class Book {
    private final String title;
    private final String isbn;
    private final int numOfPages;
    private boolean isOnLoan;

    public Book(String title, int numOfPages, String isbn) {
        this.title = title;
        this.isbn = isbn;
        this.numOfPages = numOfPages;
        this.isOnLoan = false;
    }

    public String toString() {
        return this.title + ": " + this.isbn + ", " +
                this.numOfPages + " pages, on loan: " + this.isOnLoan;
    }

    public String getTitle() {
        return this.title;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }

    public boolean isOnLoan() {
        return this.isOnLoan;
    }

    public void setOnLoan(boolean isOnLoan) {
        this.isOnLoan = isOnLoan;
    }
}
