package IntroCodes;
import java.util.Scanner;
import java.lang.Math;

public class LargestNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int LargestNumber = biggernumber(a,b);
        System.out.println("The Largest number is: " + LargestNumber);

    }
    public static int biggernumber(int a, int b){
//        if(a>b){
//            return a;
//        }
//        else{
//            return b;
//        }
        return Math.max(a,b);
    }
}
