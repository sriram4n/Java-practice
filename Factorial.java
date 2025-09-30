import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        int factorial = 1;
        for(int i = 1; i <= input; i++){
            factorial *= i;
        }
        System.out.println("The factorial of " + input + " is " + factorial);
        scan.close();
    }
}
