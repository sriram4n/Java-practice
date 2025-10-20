import java.util.*;
/*
ABCDE
ABCD
ABC
AB
A
 */
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num");
        int n = scan.nextInt();
        for(int i = n; i > 0; i--){
            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        scan.close();
    }
}
