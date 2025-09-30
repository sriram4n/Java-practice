import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int reversed = 0, digit, num;
        System.out.print("Enter number: ");
        num = scan.nextInt();
        while (num != 0){
            digit = num%10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("The reversed number is: " + reversed);
        scan.close();
    }
}