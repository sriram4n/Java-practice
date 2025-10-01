import java.util.Scanner;
/*
2----
****
***
**
*
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of pattern: ");
        int n = scan.nextInt();
        for (int i = n; i > 0; i--) {
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
