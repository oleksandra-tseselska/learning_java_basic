package OOP.BookLibrary.Interfaces;

import OOP.BookLibrary.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public interface BookInterface{
    List<Book> books = new ArrayList<>();
    default boolean isBookBorrowed(String title){
        boolean result = true;

        for (int i = 0; i < books.size(); i++){
            if(books.get(i).getTitle().equals(title)){
                result = books.get(i).getBorrowed();
            }
        }

        return result;
    }

}
