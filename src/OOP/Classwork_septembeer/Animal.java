package OOP.Classwork_septembeer;

/*
    Create a class called Animal, with fields: type, age, isWild
    and sort them using the comparator interface sorting by all 3 fields
    also sort using comparable interface with the age
 */

import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private String type;
    private int age;
    private boolean isWild;

    public Animal(final String type, final int age, final boolean isWild){
        this.type = type;
        this.age =age;
        this.isWild = isWild;
    }

    public String getType() { return type; }

    public int getAge() { return age; }

    public boolean isWild() { return isWild; }

    @Override
    public int compareTo(Animal o){
        return this.getAge() - o.age;
    }

    public String wild(boolean isWild){
        if(isWild()) {return "This is wild animal";}

        return "This is home animal";
    }

    @Override
    public boolean equals (Object o){
        if(this == o) return  true;
        if(o == null) return true;

        Animal animal = (Animal) o;
        return  Objects.equals(type, animal.type) && Objects.equals(age, animal.age) && Objects.equals(isWild, animal.isWild);
    }

    @Override
    public  String toString(){
        return  "Animal{type = "+type+"; age = "+age+" "+wild(isWild)+"}";
    }
}
