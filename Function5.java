// Enter 3 numbers from the user & make a function to print their average.
import java.util.*;
public class Function5 {
    public static void Avrage(int A, int B, int C){
        int X = (A + B + C)/3;
        //int Y = X/3;
        System.out.println(X);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int A = sc.nextInt();
        System.out.print("Enter second number:");
        int B = sc.nextInt();
        System.out.print("Enter third number:");
        int C = sc.nextInt();

        Avrage(A, B, C);
    }
}
