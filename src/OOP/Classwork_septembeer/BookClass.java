package OOP.Classwork_septembeer;

/*
    Book class
    props: title, author, price

    book objects should be sorted first by title, then author, then price.
 */

public class BookClass implements Comparable<BookClass>{
    private String title;
    private String author;
    private int price;

    public BookClass(final String title, final String author, final int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public int getPrice() { return price; }

    @Override
    public int compareTo(BookClass o){
        return this.getTitle().charAt(0) - o.getTitle().charAt(0);
    }


}
