import java.util.Scanner;
/*
5----
1
12
123
1234
 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scan.close();
    }
}