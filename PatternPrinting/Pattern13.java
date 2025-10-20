import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int len,width;
        System.out.print("enter length: ");
        len = scan.nextInt();
        System.out.print("enter width: ");
        width = scan.nextInt();
        for(int i = 1; i <= width; i++){
            if(i == 1 || i == width){
                for(int j = 1; j <= len; j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j = 1; j <= len - 2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();

    }
}
