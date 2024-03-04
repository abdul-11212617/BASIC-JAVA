import java.util.*;
public class Statement2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int X = sc.nextInt();
        System.out.print("Enter second numer:");
        int Y = sc.nextInt();

        if(X==Y){
            System.out.println("First number is equal to second number");
        }
        else if(X>Y){
            System.out.println("First number is greter than second number");
        }
        else if(X<Y){
            System.out.println("First number less then second number");
        }
        else{
            System.out.println("Number is not valid");
        }
    }
}