//  Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;

public class Function8 {
    public static void circumference(int r) {
        double pi = 3.14;
        double X = 2 * pi * r;

        System.out.println(X);
    }

    public static void main(String[] arg ){   
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius:");
        int r = sc.nextInt();

        circumference(r);
    }
}
