import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        // leap year is divisible by 4, and not 100, unless it is also divisible by 400
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        if (year <= 0) {
            System.out.println("enter a valid year");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 == 0) {
                    System.out.println("Leap year");
                } else if (year % 100 == 0) {
                    System.out.println("Not a leap year");
                } else {
                    System.out.println("Leap year");
                }
            }
            else{
                System.out.println("Not leap year");
            }
        }
        scan.close();
    }
}
