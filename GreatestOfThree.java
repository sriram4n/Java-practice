import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scan.nextInt();
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is the greatest");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is the greatest");
        }
        else{
            System.out.println(num3 + " is the greatest");
        }
        scan.close();
    }
}
