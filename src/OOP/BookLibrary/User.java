package OOP.BookLibrary;

import OOP.BookLibrary.Interfaces.UserInterface;

public class User implements UserInterface, Comparable<User>{
    private String name;
    private int age;
    private boolean active;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.active = true;
    }

    public String getName() { return name; }

    public int getAge() { return age; }

    public boolean isActive() { return active; }

    @Override
    public String toString(){
        String result = "\nUser:\n";

        for(int i = 0; i < users.size(); i++ ){
            result += "\nName = "+users.get(i).getName()+";\nAge = "+users.get(i).getAge()+";" +
                    "\nActive = "+users.get(i).isActive()+";\n";
        }

        if(result.equals("Users:")){
            result += " Is empty";
        }

        return result;
    }
     @Override
    public int compareTo(User o){
         return this.getName().charAt(0) - (int)o.getName().charAt(0);
     }

}
