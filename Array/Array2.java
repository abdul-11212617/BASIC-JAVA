package Array;
import java.util.*;
public class Array2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size OF the array :");
        int size=sc.nextInt();
        int[] Arr = new int[size];
        for(int i=0; i<Arr.length; i++){
            Arr[i] = sc.nextInt();
        } 
        for(int i=0; i<Arr.length; i++){
            System.out.println(Arr[i]);
        }   
    }
}
