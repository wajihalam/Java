import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        
        System.out.println("Type the second number: ");
        int snumber = Integer.parseInt(reader.nextLine());
        
        if (number>snumber){
            System.out.println("Greater number: " +number);
        }
        
        else if(number<snumber){
        System.out.println("Greater number: "+snumber);
    }
        else{
                System.out.println("The numbers are equal");
                }
    }
}
