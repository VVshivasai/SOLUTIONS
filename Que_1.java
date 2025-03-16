
import java.util.*;
@FunctionalInterface
interface ICalc{
    int performCalculation(int a, int b);
}
public class Que_1 {
    public static void main(String[] args) throws ArithmeticException { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = in.nextInt();
        in.nextLine();
        System.out.println("Enter the operation to perform: ");
        char op;
        while(true){
            System.out.println("Enter valid operation (+,-,*,/) or Q for Quit..!");
            op = in.nextLine().charAt(0);
            if(op == 'Q'){
                System.out.println("Exit the app successfully");
                break;
            }else if(op == '+' ||op == '-' || op =='*'||op=='/'){
                break;
            }
        }
        ICalc calc=null;
        switch(op){
            case '+':
                calc = (x,y) -> x+y;
                break;
            case '-':
                calc = (x,y) -> x-y;
                break;
            case '*':
                calc = (x,y)-> x*y;
            case '/':
                calc = (x,y) -> x/y;
        }
        try{
            if(calc != null){
                int result = calc.performCalculation(a, b);
                System.out.println("Output is : "+result);
            }
        }catch(ArithmeticException e){
            System.out.println("cant divide by 0..!");
        }
    }
}

