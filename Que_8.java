/*
Construct a class representing a "Person" with private attributes like name,
age, and ID. Implement public methods to access and modify these attributes in a controlled manner

*/

import java.util.HashSet;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        super(msg);
    }
}

class InvalidID extends Exception{
    public InvalidID(String msg){
        super(msg);
    }
}

class Person{

    private String name;
    private int age;
    private int ID;
    private static final HashSet<Integer> DataBase = new HashSet<>();

    // setters

    public void setName(String name){ // name setter
        this.name = name;
    }
    public void setAge(int age) throws InvalidAgeException{ // age setter
        if(age <= 0){
            throw new InvalidAgeException("Age Can't be Negative");
        }
        this.age = age;
    }
    public void setID(int ID)throws InvalidID{ // ID setter
        if(!DataBase.contains(ID)){
            this.ID = ID;
            DataBase.add(ID);
        }
        else throw new InvalidID("ID Can't be same..!");
    }


    // Getters 
    public String getName(){ // Name getter
        return this.name;
    }

    public int getAge(){ // Age getter
        return this.age;
    }
    public int getID(){ // ID getter
        return this.ID;
    }
}
public class Que_8 {
    public static void main(String[] args) {
        Person person1 = new Person();
        try{
            person1.setName("Rushi");
            person1.setAge(21);
            person1.setID(1);
        }catch(  InvalidID | InvalidAgeException  e){
            System.out.println(e.getMessage());
        }

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getID());

        Person person2 = new Person();
        try{
            person2.setID(1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
