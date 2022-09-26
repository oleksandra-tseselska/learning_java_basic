package OOP.BookLibrary;

import OOP.BookLibrary.Interfaces.Libraryinterface;
import OOP.BookLibrary.Interfaces.UserInterface;

import java.util.*;

public class Library extends Book implements Libraryinterface{
    public void addNewUser(String name, int age){
            users.add(new User(name, age));
    }

    public void sortUsersByName() {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return (int)o1.getName().charAt(0) - (int)o2.getName().charAt(0);
            }
        });

        for(User user: users) {
            System.out.println(user.getName());
        }
    }

    public void sortUsersByAge() {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for(User user: users) {
            System.out.println(user.getAge());
        }
    }

    public boolean isUserOfAge(String name){
        boolean result = true;
        for(int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name)) {
                if (users.get(i).getAge() >= 18) {
                    System.out.println(result+" This user can buy books 18+");
                } else {
                    result = false;
                    System.out.println(result+" This user can't buy books 18+");
                }
            }
        }
        return result;
    }

    public void addBook(String title, String author){
        if(books.isEmpty()) {
            books.add(new Book(title, author));
            return;
        }

        HashSet<String> setAuthor = new HashSet<>();
        HashSet<String> setTitle = new HashSet<>();

        for(int i = 0; i < books.size(); i++ ){
            setTitle.add(books.get(i).getTitle());
            setAuthor.add(books.get(i).getAuthor());
        }
        if(!setTitle.contains(title) || !setAuthor.contains(author)) {
            books.add(new Book(title, author));
        }
    }

    public void booksByTitle() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)o1.getTitle().charAt(0) - (int)o2.getTitle().charAt(0);
            }
        });
        for(Book book: books) {
            System.out.println(book.getTitle());
        }
    }

    public void booksByAuthor() {
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)o1.getAuthor().charAt(0) - (int)o2.getAuthor().charAt(0);
            }
        });
        for(Book book: books) {
            System.out.println(book.getAuthor());
        }
    }

    public String findBook(String string){
        String result = "\nResult of searching:\n";
        HashSet<Integer> indexes = new HashSet<>();
        for(int i = 0; i < books.size(); i++ ){
            if(books.get(i).getAuthor().contains(string) || books.get(i).getTitle().contains(string)){
                indexes.add(i);
            }
        }
        if(indexes.isEmpty()){
            result += "Not found";
        }
        for(int j : indexes) {
            result += bookOutputOnDisplay(j);
        }

        return result;
    }

    public void removeBook(String title){
       for(int i = 0; i < books.size(); i++){
           if(books.get(i).getTitle().equals(title)){
               books.remove(i);
               --i;
           }
       }
    }

    public void borrowBook(String title) {
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getTitle().equals(title)){
                books.get(i).setBorrowed(true);
                System.out.println(bookOutputOnDisplay(i));
            }
        }
    }

    public String getBookByCategory(String category) {
        String result = "\nResult of searching category "+category+":\n";

        for(int i = 0; i < books.size(); i++){
            if(books.get(i).getCategory().equals(category)){
                result += bookOutputOnDisplay(i);
            }
        }

        return result;
    }

    @Override
    public String getTitle() { return super.getTitle(); }

    @Override
    public String getAuthor() { return super.getAuthor(); }

    @Override
    public String getCategory() { return super.getCategory(); }

    @Override
    public Boolean getBorrowed() { return super.getBorrowed(); }

    @Override
    public void setBorrowed(Boolean borrowed) { super.setBorrowed(borrowed); }

    @Override
    public int getAgeLimit() { return super.getAgeLimit(); }

    @Override
    public  String toString(){
        String result = "\nLibrary:\n";

        for(int i = 0; i < books.size(); i++ ){
            result += bookOutputOnDisplay(i);
        }

        if(result.equals("Library:")){
            result += " Is empty";
        }

        return result;
    }


    public String bookOutputOnDisplay(int i){
        return "\nTitle = "+books.get(i).getTitle()+";\nAuthor = "+books.get(i).getAuthor()+";" +
                "\nCategory = "+books.get(i).getCategory()+";\nAge Limit = "+books.get(i).getAgeLimit()+
                "\nBorrowed = "+books.get(i).getBorrowed()+"\n";
    }
}
