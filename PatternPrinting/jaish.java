import java.util.Scanner;
/*
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6 
    5 6
     6
    5 6
   4 5 6 
  3 4 5 6
 2 3 4 5 6
1 2 3 4 5 6
 */
public class jaish {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j < i ; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i =  n - 1; i > 0; i--){
            for(int j = 1; j < i ; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
