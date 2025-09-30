import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num, digits = 0;
        System.out.print("Enter number: ");
        num = scan.nextInt();
        while(num != 0){
            digits++;
            num /= 10;
        }
        System.out.println("the number has " + digits + " digits");
        scan.close();
    }
}
