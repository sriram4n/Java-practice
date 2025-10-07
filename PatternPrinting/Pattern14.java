import java.util.Scanner;
public class Pattern14{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = n-1; i > 0; i--){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = i; j > 0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}