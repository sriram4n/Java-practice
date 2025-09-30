import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scan.nextInt();
        if(input % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        scan.close();
    }
}
