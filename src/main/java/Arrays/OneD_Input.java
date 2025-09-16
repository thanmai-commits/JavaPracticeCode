package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class OneD_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] A = new int[n];
        for (int i  = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(A));


    }
}
