import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        if(input < 0){
            System.out.println("Enter a positive number");
        }
        else if(input == 1){
            System.out.println("1 is neither a prime or composite.");
        } 
        else{
            for(int i = 2; i <= input / 2; i++){
                if(input % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(input + " is a prime number");
            }
            else{
                System.out.println(input + " is a composite number");
            }
        }
        scan.close();
    }
}
