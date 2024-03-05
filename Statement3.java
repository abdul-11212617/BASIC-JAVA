import java.util.*;
public class Statement3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number 1 , 2 , 3 or 4 : ");
        int x = sc.nextInt();
    
        switch (x) {
             case 1:
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namastee");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            case 4:
            System.out.println("Asslamu'alikum");
            break;
            default:
            System.out.println("Invalid input");
        }
    }
}