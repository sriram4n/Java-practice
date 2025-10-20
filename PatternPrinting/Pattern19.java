import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i * 2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 0; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i * 2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }    
}
