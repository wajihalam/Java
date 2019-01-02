
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        System.out.println("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String aname = reader.nextLine();
        
        System.out.println("Type your age: ");
        int aage = Integer.parseInt(reader.nextLine());
        
        System.out.println(name +" and "+ aname + " are " + (age+aage) + " years old in total");
    }
}
