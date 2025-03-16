
/*
    Develop a Java program that calculates the payroll for employees based on
    hours worked and hourly rates. Incorporate different pay rates for regular hours and overtime.
*/

import java.util.*;

class InvalidHoursException extends Exception{
    InvalidHoursException(String msg){
        super(msg);
    }
}

class Calclulator{
    private int perHour = 500;
    private int OverTimePerHour = perHour + 300;
    private final int fixedRegHours = 8;

    public void calculateSalary() throws InvalidHoursException {
        System.out.println("Enter the hours , you worked for..!");
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        double sal = 0;
        if(hours <= 0){
            throw new InvalidHoursException("Please kindly specify a Valid Hour.....");
        }
        else if(hours <= fixedRegHours){
            sal = hours * perHour;
            System.out.println("You earned "+ sal+" this much of monery in "+ hours+ " hr");
            return;
        }
        sal = hours * OverTimePerHour;
        System.out.println("You earned "+ sal+" this much of monery in "+ hours+ " hr");
        return;
    }
}
public class Que_9 {
    public static void main(String[] args) {
        Calclulator calci = new Calclulator();
        try{
            calci.calculateSalary();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
