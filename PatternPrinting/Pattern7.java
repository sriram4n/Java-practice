import java.util.Scanner;
/*7----
1
01
101
0101
10101
010101 digit = 1-digit
 */
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        int n = scan.nextInt();
        int digit;
        for (int i = 1; i <= n; i++) {
            if(i %2 == 0)
                digit = 0;
            else
                digit = 1;
            for(int j = 1; j<= i; j++){
                System.out.print(digit);
                digit = 1-digit;
            }
            System.out.println();
        }
        scan.close();
    }
}
