import java.util.Scanner;
public class GretestOfTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " > " + num2);
        }
        else if (num1 < num2){
            System.out.println(num2 + " > " + num1);
        }
        else{
            System.out.println(num1 + " = " + num2);
        }
        scan.close();
    }
}
