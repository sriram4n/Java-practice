import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, sum = 0;
        System.out.print("Enter number: ");
        num = scan.nextInt();
        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("the sum of digits is: " + sum);
        scan.close();
    }
}
