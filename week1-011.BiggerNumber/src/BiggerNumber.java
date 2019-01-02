
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int anumber = Integer.parseInt(reader.nextLine());
        
        int biggerNumber = Math.max(number, anumber);
        
        System.out.println("The bigger number of the two numbers given was:" +biggerNumber);
    }
}
