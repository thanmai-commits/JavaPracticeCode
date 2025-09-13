package IntroCodes;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pricipal amount: ");
        double p = sc.nextDouble();

        System.out.println("Enter the number of years: ");
        int m = sc.nextInt();

        System.out.println("Enter the Rate: ");
        int r = sc.nextInt();

        double answer = simpleinterest(p,m,r);
        System.out.println("Simple Interest is: " + answer);

    }
    public static double simpleinterest(double P, int R, int N){
        double result = 0;
        result += (P * R * N) / 100;
        return result;
    }
}
