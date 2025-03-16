
import java.util.*;

class Library {
    
    private final static HashMap<String, Integer> store = new HashMap<>();

    public static void addBook(){
        System.out.println("Enter the Book name to add in Library : ");
        Scanner sc = new Scanner(System.in);
        String Book = sc.nextLine();

        if(!store.containsKey(Book)){
            store.put(Book, 1);
        }else{
            store.put(Book,store.getOrDefault(Book,0)+1);
        }
    }

    public static void checkOut(){
        System.out.println("Enter the Book Name you want...! ");
        Scanner sc = new Scanner(System.in);
        String BookName = sc.nextLine();
        if(!store.containsKey(BookName)){
            System.out.println(BookName + " Not Available....!");
            return;
           
        }
        System.out.println("Here is your Book , Check Out..! " +BookName);
        store.put(BookName, store.get(BookName) -1);
        if(store.get(BookName)==0){
            store.remove(BookName);
        }
    }

    public static void display(){
        Set<Map.Entry<String,Integer>> BookQuantiPair = store.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = BookQuantiPair.iterator();
        System.out.println("==============================Books Available================================================");
        while(itr.hasNext()){
            Map.Entry<String,Integer> pair = itr.next(); 
            System.out.println("Book Name is : "+ pair.getKey() + " --> "+ "No Of Copies Available : "+pair.getValue());
        }
    }
}



public class Que_6 {

    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            Library.addBook();
        }
        Library.display();

        Library.checkOut();
        Library.display();
    }
}