package Lab03;

import java.util.ArrayList;

public class Library {
    private final String name;
    private String phoneNumber;
    private final ArrayList<Book> booksCollection;

    public Library(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.booksCollection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void addBook(Book book) {
        this.booksCollection.add(book);
    }

    public boolean contains(String title) {
        for (Book book : this.booksCollection) {
            String bookTitle = book.getTitle();
            if (title.equals(bookTitle)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder textToPrint = new StringBuilder(this.name + "'s collection:");
        for (Book book : this.booksCollection) {
            textToPrint.append("\n").append(book.toString());
        }
        return textToPrint.toString();
    }
}
