import java.util.Scanner;

class Computer{
    int generateRandom(){
        System.out.println("system generates the number randomly");
        int randomNum = (int)(Math.random()*10 + 1);
        return randomNum;
    }
}

class Player{
    public int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        return n;
    }
}

class Game{

    int randomNumber;
    int PlayerNumber;
    static  int  chance = 5;
    public void verify(){

        Computer genObj = new Computer();
        randomNumber = genObj.generateRandom();
        Player playObj = new Player();
        PlayerNumber = playObj.input();

        while(chance-- > 0){
            if(randomNumber == PlayerNumber){
                System.out.println("You win the game");
                break;
            }else if(PlayerNumber > randomNumber){
                System.out.println("You entered the big number than random number");
                System.out.println("Chance left "+chance);
                PlayerNumber = playObj.input();
            }else{
                System.out.println("You entered the small number than random number");
                System.out.println("Chance left "+chance);
                PlayerNumber = playObj.input();
            }
        }
    }
}
public class Que_5 {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.verify();
    }
}
