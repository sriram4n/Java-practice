import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args){
        // forumla : n*(n+1)/2
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        System.out.println("The sum of natural numbers upto " + input + " is " + (input*(input+1)/2));
        scan.close();
    }
}
