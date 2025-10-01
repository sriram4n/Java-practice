import java.util.Scanner;
/*
9-------------
*   *   *
  *   * 
    *
n=3
(n-i)*2
 */
public class Pattern9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scan.nextInt();
        
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= (n-i)*2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*   ");
            }
            System.out.println();
        }
        scan.close();
    }
}
