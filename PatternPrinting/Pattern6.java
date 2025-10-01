import java.util.Scanner;
/*
6----
A
BC
DEF
GHIJ
 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        int n = scan.nextInt();
        char ch = 'A';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        scan.close();
    }
}
