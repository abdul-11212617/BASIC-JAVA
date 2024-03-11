import java.util.*;
public class Function2 {
    public static void PrintMyName(String name) {
        System.out.println(name);

        for(int i=0; i<1; i++){
            if(str[i]==name)

        if( name == "a" || name == "e" || name == "i" || name == "o" || name == "u"){
            System.out.print("name is vowel");
        }
        else if( name == "A" || name == "E" || name == "I" || name == "O" || name == "U"){
            System.out.print("name is vowel");
        }
        else{
            System.out.print("name is not vowel");
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.next();

        PrintMyName("Hello "+name);
    }
}
