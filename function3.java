//  Write a function which takes in 2 numbers and returns ther sum and mulltiply.
import java.util.*;

public class function3 {
    public static void SumMul(int A, int B) {
        int sum = A + B;
        int mul = A * B;
        System.out.println("Sum are "+sum);
        System.out.println("mul are "+mul);
        //return sum,;
    }
    // public static int mul(int A, int B){
    //     int mul = A * B;
    //     System.out.println(mul);
    //     return mul;
    //}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int A = sc.nextInt();
        System.out.print("Enter second number:");
        int B = sc.nextInt();

        SumMul(A , B);
       // mul(A , B);
    }
}
