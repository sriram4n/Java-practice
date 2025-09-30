import java.util.Scanner;
public class FibonaaciSeries {
    public static void main(String[] args) {
        // fibonaaci series is where the next digit is sum of prev 2 digits, first 2
        // digits are : 0,1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter series size: ");
        int n = scan.nextInt();
        int prev = 0, current = 1, next = 0;
        System.out.println("Fibonaaci series: ");
        if (n == 1) {
            System.out.println(prev);
        } else if (n == 2) {
            System.out.println(prev + " " + current);
        } else {
            System.out.print(prev + " " + current);
            for (int i = 2; i <= n; i++) {
                next = prev + current;
                System.out.print(" " + next);
                prev = current;
                current = next;
            }
        }
        scan.close();
    }
}
