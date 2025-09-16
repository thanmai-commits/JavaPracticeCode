package IntroCodes;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(palindrome(num));

    }
    public static boolean palindrome(int N) {
        int num =N;
        int ans = 0;
        while (N > 0) {
            int rem = N % 10;
            N = N / 10;
            ans = ans * 10 + rem;
        }
        return ans == num;
    }
}
