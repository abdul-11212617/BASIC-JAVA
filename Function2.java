import java.util.*;
public class Function2 {
    public static void PrintMyName(String name) {
        System.out.println(name);
        char[] ch = new char[name.length()];
        //for (int i = 0; i < 1; i++) {
            //ch[i] = name.charAt(i);
           // System.out.println(name.charAt(0));
            char first = name.charAt(4);   
                if( first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
                    System.out.print(name+" is vowel");
                }
                else if( first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U'){
                    System.out.print(name+" is vowel");
                }
                else{
                    System.out.print(name+" is consonant");
                }
            }
        //}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();

        PrintMyName("Hello "+name);
    }
}
