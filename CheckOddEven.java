import java.util.*;
public class CheckOddEven{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any number:");
        int number = sc.nextInt();
        int rem = number % 2;
        
        if(rem == 0){
            System.out.println("This numner is even");
        }
        else{
            System.out.println("This number is odd");
        }
    }
}