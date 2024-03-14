//  Write a function which take a numbers and returns ther factorial
import java.util.Scanner;

public class Function4 {
  public static void Factorial(int n){
    int a = 1;
    if(n<0){
      System.out.println("Number is not valid");
    return;
    }
    for(int i = 1; i <= n; i++){
       a = (a*i);
    }
    System.out.println(a);
    return;
  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number:");
    int n = sc.nextInt();

    Factorial(n);
  }
}
