import java.util.*;
public class pattern4 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern:");
        int x = sc.nextInt();

        for(int i = x; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
