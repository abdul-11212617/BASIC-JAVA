package Array;
import java.util.*;
public class Array3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size OF the array :");
        int size=sc.nextInt();
        int[] Arr = new int[size];
        for(int i=0; i<Arr.length; i++){
            Arr[i] = sc.nextInt();
        } 
        for(int i=0; i<Arr.length; i++){
            int temp=Arr[0];
            Arr[i]=Arr[i+1];
            Arr[Arr.length-1]=temp;
        }
        for(int i =0;i<Arr.length;i++){
            System.out.print(Arr[i]+" ");
        }
    }
}
