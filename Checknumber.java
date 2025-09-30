import java.util.Scanner;

public class Checknumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scan.nextInt();
        if(input >= 0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        scan.close();
    }
}
