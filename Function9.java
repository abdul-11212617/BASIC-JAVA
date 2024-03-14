//  Write a function that takes in age as input and returns if that person is eligible to vote or not.
//  A person of age > 18 is eligible to vote.
import java.util.*;
public class Function9 {
    public static void VotingEligibility(int X){
        if(X >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligibl to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
        int X = sc.nextInt();

        VotingEligibility(X);
    }
}
