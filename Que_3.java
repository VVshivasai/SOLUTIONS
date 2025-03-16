
import java.util.*;
/*
    3.Create a Java program to calculate the simple interest. Ask the user to input
     principal amount, interest rate, and time period. Calculate and display the simple interest
*/
class User {
    public double input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Enter details---");
        
        System.out.println("Enter the principal amount: ");
        int principalAmount = sc.nextInt();
        
        System.out.println("Enter the rate of interest: ");
        float rateOfInterest = sc.nextFloat();
        
        System.out.println("Enter the time period: ");
        int timePeriod = sc.nextInt();
        
        return calculateSimpleInterest(principalAmount, rateOfInterest, timePeriod);
    }

    private double calculateSimpleInterest(int principalAmount, float rateOfInterest, int timePeriod) {
        SimpleInterest si = new SimpleInterest(principalAmount, rateOfInterest, timePeriod);
        return si.calculate();
    }
}

class SimpleInterest {
    private int principalAmount;
    private float rateOfInterest;
    private int timePeriod;

    public SimpleInterest(int principalAmount, float rateOfInterest, int timePeriod) {
        this.principalAmount = principalAmount;
        this.rateOfInterest = rateOfInterest;
        this.timePeriod = timePeriod;
    }

    public double calculate() {
        return (principalAmount * rateOfInterest * timePeriod) / 100;
    }
}

public class Que_3 {
    public static void main(String[] args) {
        User user = new User();
        double result = user.input();
        System.out.println("Simple interest is: " + result);
    }
}
