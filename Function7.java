//  Write a function which takes 2 numbers and returns the greater of those two.
import java.util.*;
public class Function7 {
    public static void MyFunction(int X, int Y){
        if(X > Y){
            System.out.println(X+" is greater then "+Y);
        }
        else if(X < Y){
            System.out.println(X+" is less then "+Y);
        }
        else{
            System.out.println(X+" is equal to "+Y);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int X = sc.nextInt();
        System.out.print("Enter second number:");
        int Y = sc.nextInt();

        MyFunction(X, Y);
    }
}
