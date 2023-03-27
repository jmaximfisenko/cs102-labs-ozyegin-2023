package Lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Book book1 = new Book("Don Quixote", 344, "111-11-1" );
        Book book2 = new Book("Harry Potter", 257, "222-22-2" );
        Book book3 = new Book("1984", 399, "333-33-3" );

        System.out.println("Book1 isbn: " + book1.getIsbn());
        System.out.println("Book2 number of pages: " + book2.getNumOfPages());

        // book3 is on loan
        book3.setOnLoan(true);
        System.out.println("Book3 is on loan: " + book3.isOnLoan());

        Book book4 = new Book("War and Peace", 1000, "444-44-4" );
        Book book5 = new Book("Odyssey", 500, "555-55-5" );

        Library lib1 = new Library("Library1", "+90-544-1111111");
        Library lib2 = new Library("Library2", "+90-544-2222222");

        System.out.println("=============================");
        System.out.println("Library1's name: " + lib1.getName());

        // setting a new phone number to lib2
        lib2.setPhoneNumber("+90-544-3333333");
        System.out.println("Library2's phone number: " + lib2.getPhoneNumber());


        lib1.addBook(book1);
        lib1.addBook(book2);
        lib1.addBook(book3);

        lib2.addBook(book4);
        lib2.addBook(book5);

        System.out.println("=============================");
        System.out.println(lib1);
        System.out.println("=============================");
        System.out.println(lib2);

        System.out.println("=============================");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the book title: ");
        String userTitle = input.nextLine();

        ArrayList<Library> libraryArrayList = new ArrayList<>();
        libraryArrayList.add(lib1);
        libraryArrayList.add(lib2);

        findBook(userTitle, libraryArrayList);

    }

    public static void findBook(String title, ArrayList<Library> libraryArrayList) {
        for (Library library: libraryArrayList) {
            if (library.contains(title)) {
                System.out.println("The book is stored in " + library.getName());
                return;
            }
        }
        System.out.println("The book isn't stored in any libraries.");
    }
}
