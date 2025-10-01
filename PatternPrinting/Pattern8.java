import java.util.Scanner;

/*
8-------- n=4
      *
    *   *
  *   *   *
*   *   *   *
n=4
****** (4-i)*2;
****
**
n=3
**** (3-i)*2
**
*
*   *
*   *   *
 */
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        scan.close();
    }
}
