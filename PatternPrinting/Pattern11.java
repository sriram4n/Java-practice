import java.util.Scanner;
public class Pattern11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){ // top triangle
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n - 1; i > 0; i--){ // bottom triangle (1 less interation)
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}