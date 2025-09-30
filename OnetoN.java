import java.util.Scanner;
public class OnetoN {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scan.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        scan.close();
    }
}
