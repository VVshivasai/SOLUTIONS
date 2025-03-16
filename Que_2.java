


/*
    Create a class named "Car" with attributes like make, model, and year. 
    Implement methods to set and display these attributes for different car objects 
*/
class Car{

    private String make;
    private String model;
    private int year;

    public void set(String make, String model, int year) {
        if(year <=0){
            throw new IllegalArgumentException("Please speicfy a valid Year");
        }
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void display(){
        System.out.println("Car is Manufacured By : "+make);
        System.out.println("Model of the Car is : "+model);
        System.out.println("Introduced in the market in the year : "+year);
    }
}
public class Que_2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        try{
            car1.set("Tata EV","Nexon", 2023);
            car1.display();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
