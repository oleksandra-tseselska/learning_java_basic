package OOP.BookLibrary;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BookLibrary {
    public static void main(String[] arg){


        Library library = new Library();

        library.addBook("Black dog", "Stephen Booth");
        library.addBook("Black dog", "Stephen Booth");

        library.addBook("Black dog", "Piter Gry");
        library.addBook("White dog", "Stephen Booth");

        library.addBook("Black dog", "Stephen White");

        library.addBook("Black dog", "Tim White");
        library.addBook("Red dog", "Stephen Booth");
        library.addBook("Black dog", "Stephen Booth");



            System.out.println(library.toString());

        library.removeBook("Black dog");

            System.out.println(library.toString());

        System.out.println(library.findBook("Red dog"));

        if(library.isBookBorrowed("Red dog")){
            System.out.println("This book borrowed");
        }else {
            System.out.println("This book isn't borrowed");
        }

        library.borrowBook("Red dog");

        System.out.println(library.getBookByCategory("other"));

        library.addNewUser("Kate", 13);
        library.addNewUser("Jane", 21);
        library.addNewUser("Dan", 18);
        library.sortUsersByName();
        library.sortUsersByAge();

        library.booksByTitle();
        library.booksByAuthor();

        library.isUserOfAge("Kate");
    }

}
