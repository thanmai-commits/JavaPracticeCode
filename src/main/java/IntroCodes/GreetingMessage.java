package IntroCodes;
import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Name = sc.nextLine();

        System.out.println("Hello " + Name + " Welcome to the world of coding");
    }
}
