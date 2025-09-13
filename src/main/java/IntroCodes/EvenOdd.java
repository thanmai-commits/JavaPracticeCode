package IntroCodes;

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int test = sc.nextInt();
        Even_or_odd(test);
    }
    public static void Even_or_odd(int n){
        if (n % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
