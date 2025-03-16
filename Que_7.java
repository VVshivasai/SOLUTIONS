/*
.Create a class "Product" with attributes like name, price, and quantity.
Implement multiple constructors to initialize objects with different sets of parameters. 

*/


class Product{
    String name;
    double price;
    long quantity;

    public Product(String name){
        this.name = name;
    }
    public Product(String name, double price){
        this(name);
        this.price = price;  
    }

    public Product(String name, double price, long quantity){
        this(name, price);
        this.quantity = quantity;

    }

    public String toString(){
        return "[ Name : " +name +" \n Price : "+ price + "\n Quantity : " + quantity+ " Pages]";
    }
}
public class Que_7 {
    public static void main(String[] args) {
        Product prod1 = new Product("DSA BOOK", 499.99, 980);
        System.out.println(prod1);
    }
}
