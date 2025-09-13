package IntroCodes;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in INR: ");
        double money = sc.nextDouble();
        double Dollars = INRtoDollar(money);
        System.out.println("INR to Dollar would be: " + Dollars);

    }
    public static double INRtoDollar(double amount){
        amount /= 88.27;
        return amount;
    }
}
