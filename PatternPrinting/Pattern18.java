import java.util.*;
/*
E 
D E
C D E 
B C D E 
A B C D E 
 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = scan.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = i; j > 0; j--){
                char ch = (char) ('A' + n - j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
