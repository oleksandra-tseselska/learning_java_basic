package OOP;

public class User implements Comparable<User>{
    private final String name;
    private final int age;

    public  User (final String name, final int age){
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    @Override
    public int compareTo(User o){
        return this.getAge() - o.age;
    }

    @Override
    public  String toString(){
        return  "User{name = "+name+"; age = "+age+"}";
    }
}
