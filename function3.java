import java.util.*;

public class function3 {
    public static int sum(int A, int B) {
        int sum = A + B;
        System.out.println(sum);
        return sum;
        // System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int A = sc.nextInt();
        System.out.print("Enter second number:");
        int B = sc.nextInt();

        sum(A, B);
    }
}
