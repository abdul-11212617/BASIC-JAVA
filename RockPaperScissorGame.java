import java.util.*;
public class RockPaperScissorGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name =sc.nextLine();
        
        System.out.println(name+" Welcome! to the Rock Paper Scissor Game");
        System.out.println("");
        System.out.println("The winning rules of the game are:");
        System.out.println("        between rock and paper: Paper wins");
        System.out.println("        between rock and scissors: Rock wins");
        System.out.println("        between paper and Scissors: Scissors wins");
        System.out.println("");

        System.out.println("Choose between the following:");
        System.out.println("press 1 for rock");
        System.out.println("press 2 for paper");
        System.out.println("press 3 for scissors");

        Scanner bc = new Scanner(System.in);
        System.out.print("Enter your choice 1, 2, or 3:");
        int Y = bc.nextInt();

        System.out.println(name+" choose: "+Y);
        System.out.println("");
        System.out.println("Now computer chooses....");
            
    }
}
