import java.util.Scanner;
/*
10---------------
*
**
***
****
*****
******* n=6 (given)
*****
****
***
**
*
 */
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}