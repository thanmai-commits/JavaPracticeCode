package IntroCodes;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which number you want: ");
        int N =  sc.nextInt();
        int Fibo = fibonacci(N);
        System.out.println(Fibo);
    }
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;
        int c = 0;

        for(int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
