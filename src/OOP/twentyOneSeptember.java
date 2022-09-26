package OOP;

import OOP.Classwork_septembeer.BookClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class twentyOneSeptember {
    public static void main(String[] arg) {
        List<BookClass> books = Arrays.asList(new BookClass("Book1", "Jane", 12), new BookClass("Book6", "Kate", 4));

        Collections.sort(books, new Comparator<BookClass>(){
            @Override
            public  int compare(BookClass o1, BookClass o2){
                if(o1.getAuthor() == o2.getAuthor()){
                    return o1.getTitle().charAt(0) - o2.getTitle().charAt(0);
                }
                if (o1.getTitle() == o2.getTitle()){
                    return o1.getPrice() - o2.getPrice();
                }

                if (o1.getPrice() == o2.getPrice()){
                    return o1.getPrice() - o2.getPrice();
                }
                return 0;
            }
        });
    }

}
