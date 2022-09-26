package OOP.Classwork_septembeer;

import java.util.Objects;

public class Car {
    private String name;
    private String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }


    @Override
    public boolean equals (Object o){
        if(this == o) return  true;
        if(o == null) return true;

        Car car = (Car) o;
        return  Objects.equals(name, car.name) && Objects.equals(type, car.type);
    }

    @Override
    public  String toString(){
        return  "Car{name = "+name+"; type = "+type+"}";
    }

    @Override
    public int hashCode(){
        return  31 * name.hashCode() + type.hashCode();
    }


}
