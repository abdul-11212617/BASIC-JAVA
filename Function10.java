//  Two numbers are entered by the user, x and n.
//  Write a function to find the value of one number raised to the power of another i.e. x^n.
import java.util.*;
public class Function10 {
    public static void CalculatePower(int x, int y){
        // int power = (int) Math.pow(x,y);
        // System.out.println(power);

        int z = x;
        
        for(int i = 1; i < y; i++){
           z=z*x;
        }
        System.out.println(z);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int x = sc.nextInt();
        System.out.print("Enter secomd number:");
        int y = sc.nextInt();

        CalculatePower(x, y);
    }
    
}