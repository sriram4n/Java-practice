import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int reversed = 0, digit;
        System.out.println("enter a number: ");
        int input = scan.nextInt();
        int original = input;
        while(input != 0){
            digit = input % 10;
            reversed = reversed * 10 + digit;
            input /= 10;
        }
        if(original == reversed){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It isnt a palindrome");
        }
        scan.close();
    }
}
