import java.util.Scanner;
public class Vowel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word / character: ");
        char input = scan.nextLine().charAt(0);
        input = Character.toLowerCase(input);
        if(input >= 'a' && input <= 'z'){
            if(input == 'a' || input == 'e' ||input == 'i' ||input == 'o' ||input == 'u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonent");
            }
        }
        else{
            System.out.println("Enter an alphabet");
        }
        scan.close();
    }
}
