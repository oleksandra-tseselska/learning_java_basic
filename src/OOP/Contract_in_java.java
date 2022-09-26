package OOP;

import OOP.Classwork_septembeer.Animal;

import java.util.*;

public class Contract_in_java {
    public static void main(String[] arg) {
          Animal tiger = new Animal("Tiger", 3, true);
          Animal dog = new Animal("dog", 4, false);

        List<Animal> users = Arrays.asList(tiger, dog);

        Collections.sort(users, new Comparator<Animal>(){
            @Override
            public  int compare(Animal o1, Animal o2){
                return o1.getAge() - o2.getAge();
            }
        });

        Animal[] animals = new Animal[]{
                new Animal("Pig", 2, false),
                new Animal("Swan", 1, true)
        };

        Arrays.sort(animals);
//        System.out.println(Arrays.toString(animals));

        for(Animal animal: animals){
            System.out.println(animal.getType());
            System.out.println(animal.getAge());
            System.out.println(animal.isWild());
        }

//        name.hashCode() == pet.hashCode() for objects(Class, etc)
//        name.equals(pet) for primitive variable(String, Integer, Boolean)

//        Car car = new Car("BMW", "Sport");
//        Car car2 = new Car("BMW", "Sport");
//        Car car3 = new Car("Volvo","Sport");
//
//        System.out.println(car.equals(car2));
//        System.out.println(car.toString());
//        Set<Car> cars = new HashSet<>();
//
//        cars.add(car);
//        cars.add(car2);
//        cars.add(car3);
//
//        System.out.println(cars.contains(new Car("Volvo","Sport")));

//        List<User> users = Arrays.asList(new User("Peter", 20), new User("John", 23));

//        Collections.sort(users, new Comparator<User>(){
//            @Override
//            public  int compare(User o1, User o2){
//                System.out.println((int)o1.getName().charAt(0));
//                System.out.println((int)o2.getName().charAt(0));
//                return (int)o1.getName().charAt(0) - (int)o2.getName().charAt(0);
//            }
//        });

//        User[] usersY = new User[]{
//                new User("John", 23),
//                new User("Peter", 20)
//        };
//
//        Arrays.sort(usersY);
//        System.out.println(Arrays.toString(usersY));
//
//        for(User user: users){
//            System.out.println(user.getName());
//        }
    }
}
