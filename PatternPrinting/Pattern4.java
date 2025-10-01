import java.util.Scanner;
/*
4----
****
 ***
  **
   *
*/
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of pattern: ");
        int n = scan.nextInt();
        for(int i = n; i > 0; i--){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
