//  Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class Function6 {

    public static void sumOfOddNumbers(int n) {
      int sum = 0;
      for (int i = 0; i <= n; i++) {
        if (i % 2 != 0) {
          //sum += i;
          sum = sum + i;
        }
      }
      System.out.println("Sum of odd numbers from 0 to " + n + ": " + sum);
    }
  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter any number: ");
      int n = sc.nextInt();
  
      sumOfOddNumbers(n);
    }
  }
  