package IntroCodes;
import java.util.Scanner;

public class Armstrong {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int N = sc.nextInt();
        boolean ans = armstrong(N);
        System.out.println(ans);
    }
    public static boolean armstrong(int num){
        int hundreds = num/100;
        int tens = (num % 100)/10;
        int units = num % 10;

        int result = hundreds * 100 + tens * 10 + units;
        return result == num;
    }
}
