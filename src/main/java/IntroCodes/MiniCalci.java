package IntroCodes;

import java.util.Scanner;

public class MiniCalci {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operator/operation: ");
        char operator = sc.next().charAt(0);
        int ans = calculator(a, b, operator);
        System.out.println(a + " + " + b + " = " + ans);
    }
    public static int calculator(int a, int b, char operator){
        int result = 0;
        switch(operator){
            case '+':
                result = a + b;
                break;
            case  '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
        }
        return result;
    }
}
