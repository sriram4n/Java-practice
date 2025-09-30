import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        // armstrong -> 3 digit: 153 = 1^3+3^3+5^3, len -> sum+=pow(digit,len)
        Scanner scan = new Scanner(System.in);
        int input, digit = 0, sum = 0, clone;
        System.out.print("Enter a number: ");
        input = scan.nextInt();
        clone = input;
        int len = String.valueOf(input).length();
        while(clone != 0)
        {
            digit = clone%10;
            sum += Math.pow(digit,len);
            clone /= 10;
        }
        if(input == sum){
            System.out.println("Armstrong number!");
        }
        else{
            System.out.println("Not an armstrong number");
        }
        scan.close();
    }
}
