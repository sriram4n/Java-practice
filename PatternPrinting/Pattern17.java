/*
   A
  ABA
 ABCBA
ABCDCBA
 */
import java.util.Scanner;

public class Pattern17{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(ch++);
            }
            ch--;
            for(int j = 1; j <= i - 1; j++){
                System.out.print(--ch);
            }
            System.out.println();
        }
        scan.close();
    }
}
